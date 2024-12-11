package C02ClassBasic;

public class C0202Class {
    public static void main(String[] args) {
//        System.out.println(myCalculator.sum(10,20));

////        A부서의 매출
////        20원 매출
//        myCalculator.sumACC(20);
//        System.out.println(myCalculator.total);
////        30원 매출
//        myCalculator.sumACC(30);
//        System.out.println(myCalculator.total);
////        40원 매출
//        myCalculator.sumACC(40);
//        System.out.println(myCalculator.total);
//
////        B부서의 매출
////        10원
//        myCalculator.sumACC(10);
//        System.out.println(myCalculator.total);
////        20원
//        myCalculator.sumACC(20);
//        System.out.println(myCalculator.total);

////        객체를 사용한 회계 프로그램 : 객체 고유의 메모리 공간 할당
//        myCalculatorInstance m1 = new myCalculatorInstance();
//        myCalculatorInstance.total_count ++;
//        m1.sumACC(10);
//        m1.sumACC(20);
//        System.out.println(m1.total);
//
//        myCalculatorInstance m2 = new myCalculatorInstance();
//        myCalculatorInstance.total_count ++;
//        m2.sumACC(30);
//        m2.sumACC(40);
//        System.out.println(m2.total);

        C0202Person p1 = new C0202Person();
        p1.setName("준혁");
        p1.setAge(26);
        p1.setEmail("asdf@naver.com");
        p1.eating();
//        System.out.println(p1.WhoIs());
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getEmail());

    }
}

class myCalculator{
//    static이 붙어있는 변수는 클래스변수, static이 붙어있지 않으면 객체변수
     static int total = 0;

     static void sumACC(int a) {
        total += a;
    }
}
class myCalculatorInstance{
     static int total_count = 0;

     int total = 0;

     void sumACC(int total) {
//         this는 객체 그 자신을 의미
//         예를 들어 m1객체일 경우 m1.total, m2객체일 경우 m2.total
//         일반적으로, 매개변수와 객체변수를 구분 짓기 위해 사용해야 함.(생략가능-매개변수와 이름이 같지 않을 경우)
        this.total += total;
    }
}

