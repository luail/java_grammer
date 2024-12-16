package C03Inheritance.ProtectedPackage;

public class C0304ProtectedTest {
    public static void main(String[] args) {
        C0304ProtectedClass p1 = new C0304ProtectedClass();
//        public 변수 접근가능.
        System.out.println(p1.st4);
//        protected, default 변수 접근가능(같은 패키지임으로.)
        System.out.println(p1.st3);
        System.out.println(p1.st2);

//        private 변수는 같은 클래스내에서만 접근.
//        System.out.println(p1.st1);
    }
}
