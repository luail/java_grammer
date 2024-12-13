package C02ClassBasic;

public class C0207FuctionCall {
    public static void main(String[] args) {
        System.out.println("main 함수 시작.");
        funcntion1();
        System.out.println("main 함수 끝.");
    }

    public static void funcntion1() {
        System.out.println("f1 시작");
//        함수가 자기 자신을 호출하는 함수일 경우 이를 재귀함수라 부른다.
//        재귀함수에 종료 로직이 없는경우 스택 메모리에 함수가 무한히 쌓여 스택 오버 플로우 에러가 발생한다.
        funcntion1();
        System.out.println("f1 종료");
    }
    public static void funcntion2() {
        System.out.println("f2 시작");
        System.out.println("f2 종료");
    }
}
