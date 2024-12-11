package C02ClassBasic;

public class C0204MethodOverLoading {
    public static void main(String[] args) {
        C0204MethodOverLoading c1 = new C0204MethodOverLoading();
        System.out.println(c1.sum(10,20));
        System.out.println(c1.sum(10, 20, 30));
        System.out.println(c1.sum(10.2, 20.3));
    }

//    접근제어자를 안붙이면 기본적으로 default 접근제어자 : 같은 패키지 내에서만 접근 가능.
    int sum(int a, int b) {
        return a+b;
    }

    int sum(int a, int b, int c) {
        return a+b+c;
    }

//    매개변수의 타입 또는 개수가 다르면 같은 이름의 메소드 정의가 가능하다.
//    이를 메소드 오버로딩이라 부른다.
    double sum(double a, double b) {
        return a + b;
    }
}
