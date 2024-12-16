package C03Inheritance.ProtectedPackage;

// 클래스에는 public과 defalut 접근제어자만 존재한다.
public class C0304ProtectedClass {
//    변수와 메서드에는 4가지 접근제어자가 존재
//    public : 프로젝트 전체에서 접근가능 (다른패키지도 접근가능)
//    protected : 패키지를 벗어나더라도 상속관계일 경우 접근가능.
//    default : 같은 패키지내에서 접근가능.
//    private : 같은 클래스내에서만 접근가능.
    private String st1 = "hello java1";

    String st2 = "hello java2";

    protected String st3 = "hello java3";

    public String st4 = "hello java4";
}
