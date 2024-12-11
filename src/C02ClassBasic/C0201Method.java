package C02ClassBasic;

public class C0201Method {
    public static void main(String[] args) {
//        for문을 이용해 1~10까지 total값 출력
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum+=i;
        }
        System.out.println(sum);

//        for문을 이용해 1~10까지 total값 출력
        int sum2 = 0;
        for (int i = 10; i < 21; i++) {
            sum2+=i;
        }
        System.out.println(sum2);

//        코드의 중복이 발생하므로, 반복을 피하기 위해 위 코드의 기능을 별도로 분리한다.
//        메서드 사용의 이유가 곧 중복을 피하기 위함이다.
//        기본호출방식 : 클래스명.메서드

        System.out.println(C0201Method.sum(1,10));
        System.out.println(C0201Method.sum(10,20));
//        같은 클래스내에서 정의된 클래스메서드의 호출은 클래스명 생략 가능.
        System.out.println(sum(10,30));
    }

//    int 리턴타입을 가짐.
//    매개변수로서 int 2개를 정의.
//    메서드 구성 요소 : 접근제어자(public), 클래스메서드여부(static), 리턴타입(int)
    public static int sum(int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += i;
        }
        return total;
    }


}
