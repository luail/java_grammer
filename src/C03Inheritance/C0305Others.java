package C03Inheritance;

//final class는 상속불가.
//public class C0305Others extends FinalParents {

import java.util.List;

public class C0305Others {
    public static void main(String[] args) {
        AbstractDog d1 = new AbstractDog();
        d1.makeSound1();  // makeSound1은 상속받은것.
        d1.makeSound2();  // makeSound2는 상속받은것을 구현한 것.

////        추상클래스와 인터페이스는 별도의 구현없이 객채생성 불가.
//        AbstractAnimal a1 = new AbstractAnimal();
//        List<Integer> list1 = new List<Integer>();
    }
}
// abstract 메서드가 하나라도 있으면 반드시 class에도 abstract키워드가 붙어야한다.
abstract class AbstractAnimal {
    void makeSound1() {
        System.out.println("동물소리를 냅니다.");
    }

//    리턴타입과 매개변수만 있는 메서드 선언만 존재.
    abstract void makeSound2();
}
class AbstractDog extends AbstractAnimal {
//    abstract 클래스를 상속받을때에는 overriding 강제. (abstract가 붙어있는 메서드만.)

    @Override
    void makeSound2() {
        System.out.println("멍멍멍~~");
    }
}





final class FinalParents {

}
