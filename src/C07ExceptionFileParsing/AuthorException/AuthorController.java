package C07ExceptionFileParsing.AuthorException;


import java.util.Scanner;

//사용자의 입출력을 받아 처리하는 계층(controller)
public class AuthorController {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        while (true) {
            System.out.println("회원가입 1번, 로그인 2번, 회원목록조회 3번");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals("1")) {
                System.out.println("이름을 입력해주세요.");
                String name = sc.nextLine();
                System.out.println("email을 입력해주세요.");
                String email = sc.nextLine();
                System.out.println("password를 입력해주세요.");
                String password = sc.nextLine();
//                email중복방지, password길이 8자리이상.
                try {
                    authorService.register(name, email, password);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                    System.out.println("에러 메시지 : " + e.getMessage());
                }

            } else if (input.equals("2")) {
                System.out.println("email을 입력해주세요.");
                String email = sc.nextLine();
                System.out.println("password를 입력해주세요.");
                String password = sc.nextLine();
//                email과 password가 맞는지 검증.
                try {
                    authorService.login(email, password);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                    System.out.println("에러 메시지 : " + e.getMessage());
                } catch (NullPointerException e) {
                    System.out.println("에러 메시지 : " + e.getMessage());
                }
                System.out.println("로그인 되었습니다.");
//            } else if (input.equals("3")) {
//                for (Author a : authorService.findAll()) {
//                    System.out.println(a.toString());
//                }
////                전체목록을 서비스로부터 받아와서 출력.
            }
        }
    }
}
