package C03Inheritance;

// extends 키워드를 통해 상속을 수행한다.
// C0301이라는 클래스가 변수와 메서드를 상속했다.
// 따라서 부모클래스의 기능을 사용하려면 당연히
// 상속받은 자식클래스의 객체를 생성해야 가능하다.
// 이후 자식클래스에서 새롭게 변수와 메서드 추가 가능하다.
// 부모의 변수와 메서드를 자식이 재정의하는것도 가능하다. (이 경우 자식클래스의 내용이 우선.)
public class C0301Inheritance extends Parents {
    int c = 10;

    public static void main(String[] args) {
        C0301Inheritance c1 = new C0301Inheritance();
//        변수상속
        System.out.println(c1.a);
        System.out.println(c1.c);
//        private 변수, 메서드는 자식클래스에서 사용(접근) 불가.
//        System.out.println(c1.b);

//        메서드상속
        c1.m1();
        c1.m2();
    }
//     부모 메서드의 재정의 : overriding
//    @Override : override임을 명시적으로 표현하는 표현식. 성능을 위해서 붙여주는게 더 좋은것으로 알려져있음.
    @Override
    void m1() {
        System.out.println("자식클래스 입니다.");
    }

    void m2() {
        System.out.println("클래스2 입니다.");
    }
}

class Parents {
    int a = 10;

    private int b = 20;

    void m1() {
        System.out.println("클래스 입니다.");
        System.out.println(b);
    }
}
