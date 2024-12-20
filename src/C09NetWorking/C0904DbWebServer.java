package C09NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class C0904DbWebServer {
    public static void main(String[] args) throws IOException, SQLException {
//        소켓이란 서버와 사용자가 통신을 하기 위한 네트워크 통신의 끝점을 나타내는 개념.
        ServerSocket serverSocket = new ServerSocket(8080);
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
        String userName = "root";
        String password = "1234";

        Connection connection = DriverManager.getConnection(url, userName, password);
        System.out.println("서버 시작");
        String id="";
        while (true) {
//            accept : 사용자의 연결 요청을 수락
//            socket객체 안에는 사용자의 정보(ip 등)
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null && !line.isEmpty()) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            String requestString = sb.toString();
            String firstline = requestString.split("\n")[0];
            String infos = firstline.split(" ")[1];
            if (infos.contains("?")) {
                id = infos.split("=")[1];
            }

//        Statement객체에 쿼리를 담아 db에 전달.
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from post where id="+id);

            int outputId = 0;
            String title = "";
            String contents = "";
//        rs.next()를 통해 데이터를 1row씩 read
            while (rs.next()) {
                outputId = rs.getInt("id");
                title = rs.getString("title");
                contents = rs.getString("contents");
            }

//            사용자에게 응답을 줄 메시지를 http프로토콜에 맞게 세팅.
            String response = "HTTP/1.1 200 OKay\r\n\r\n" + "id는 " + id + "\n" + "title = " + title + "\n" + "contents = " + contents;
//            사용자에게 메시지 응답
            socket.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
//            플러시란 일반적으로 변경사항을 확정하는 것을 의미
            socket.getOutputStream().flush();
            socket.close();
        }
    }
}