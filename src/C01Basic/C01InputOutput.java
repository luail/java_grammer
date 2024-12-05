package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) throws IOException {
////           출력 : System.out을 통해 콘솔출력
//        System.out.println(20);  //sout 단축어 사용가능
//        System.out.print("hello world"); //print는 줄바꿈 없는 출력
//        System.out.print("hello world2");

//        입력 : System.in(키보드입력) + Scanner(입력을위한클래스)활용
        int a = 10; // 10이라는 숫자를 변수명 a에 할당
//        Scanner myScanner = new Scanner(System.in);  // Scanner 객체를 myScanner 변수에 할당.
////        nextLine메서드 : 입력받은 데이터를 한줄로 읽어서, String으로 리턴
//        String inputLine = myScanner.nextLine();
//        System.out.println("입력사항은 " + inputLine);

//        예를 들어 아래와ㅏ 같은 입력값이 주어질 때 처리방법.
        /*  abc
            bcd
            2   */
//        Scanner myScanner = new Scanner(System.in);
//        String inputLine1 = myScanner.nextLine();
//        String inputLine2 = myScanner.nextLine();
//        int count = myScanner.nextInt();
//        System.out.println("입력사항1 : " + inputLine1);
//        System.out.println("입력사항2 : " + inputLine2);
//        System.out.println("입력사항3 : " + count);




//        입력 : System.in + BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        System.out.println(input1);

        String[] input2= br.readLine().split(" ");
        System.out.println(input2[0]);
        System.out.println(input2[1]);
        System.out.println(input2[2]);

    }
}
