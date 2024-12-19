package C07ExceptionFileParsing;

import java.sql.SQLException;
import java.util.Scanner;

public class C0701Exception {
    public static void main(String[] args) {
////        일반적인 예외처리 방식.
//        System.out.println("나눗셈 프로그램 입니다.");
//        Scanner sc = new Scanner(System.in);
////        예외가 발생할 것으로 예상되는 코드에 try로 감싼다.
//        try {
//            System.out.println("분자를 입력해주세요.");
//            int head = Integer.parseInt(sc.nextLine());
//            System.out.println("분모를 입력해주세요.");
//            int tail = Integer.parseInt(sc.nextLine());
//            int result = head / tail;
//            System.out.println("두 수를 나눈 값은 " + result);
////            catch로 예외를 잡아낸다. 여러가지의 예외가 있을때는 catch 여러개.
//        } catch (ArithmeticException error) {
//            System.out.println("0으로 나누시면 안됩니다.");
//            error.printStackTrace();
//        } catch (NumberFormatException error) {
//            System.out.println("문자를 입력하시면 안됩니다.");
//            error.printStackTrace();
////            Exception 클래스는 모든 예외의 조상 클래스
////            위의 구체적인 예외상황이 아닌 다른 예외가 발생했을 때 Exception으로 빠짐.
////            모든것을 Exception을 사용할 경우 적절한 메시지를 사용자에게 전달해줄 수 없다.
//        } catch (Exception e) {
//            System.out.println("예상치 못한 예외가 발생했습니다.");
////            e.getMessage는 예외 메세지만 담는다.
//            System.out.println(e.getMessage());
//        } finally {
////            예외발생 여부와 관계없이 무조건 실행되는 구문이다.
//            System.out.println("무조건 실행되는 구문입니다.");
//        }
//        System.out.println("감사합니다.");

        System.out.println("로그인을 위한 비밀번호을 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
//        login(password);
//        checked exception의 경우에는 예외처리를 위임받게되면, 반드시 예외처리를 해줘야함
        try {
            login2(password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

//    throws키워드를 통해 예외를 위임 다만, unchecked 예외에서는 예외가 강제가 아니므로, throws가 큰 의미가 없음.
    static void login(String pw) throws IllegalArgumentException{
        if (pw.length() < 10) {
            System.out.println("비밀번호의 길이가 너무 짧습니다.");
//            throw new : 예외를 강제로  발생.
//            unchecked 예외는 예외처리가 강제되지 않음.
//            예외는 기본적으로 메서드를 호출한 쪽으로 전파.
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        } else {
            System.out.println("로그인 되었습니다.");
        }
    }

    static void login2(String pw) throws SQLException{
        if (pw.length() < 10) {
            System.out.println("비밀번호의 길이가 너무 짧습니다.");
//            checked Exception은 예외처리가 강제.
//            해당 메서드내에서 예외처리 or 예외를 throws 해줘야함.
            throw new SQLException("비밀번호가 너무 짧습니다.");
        } else {
            System.out.println("로그인 되었습니다.");
        }
    }
}
