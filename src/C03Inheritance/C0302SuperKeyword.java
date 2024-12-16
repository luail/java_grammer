package C03Inheritance;

//부모 클래스(superParents)에 변수 a선언 10 할당.
//부모 클래스에 객체 메서드 display 선언하고 부모클래스입니다. 출력.
//자식클래스에서 상속받고 부모클래스의 변수a출력, 부모클래스의 display 호출
public class C0302SuperKeyword extends superParents{
    int a;
    C0302SuperKeyword() {
//        super() : 부모클래스의 생성자를 의미.
        super(10);
        a = 20;
    }
    public static void main(String[] args) {
//        main메서드는 static이 붙어있어서, 객체변수나 객체메서드를 호출하려면
//        객체를 만든 뒤에 호출해야한다!
        C0302SuperKeyword c1 = new C0302SuperKeyword();
//        c1.display();
        c1.display2();
    }

    void display2() {
        System.out.println(a);
        System.out.println(super.a);
    }
}

class superParents {
    int a;
    superParents(int a) {
        this.a = a;
    }

    superParents() {

    }

    void display() {
        System.out.println("부모 클래스입니다.");
        System.out.println(this.a);
    }
}


