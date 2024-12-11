package C02ClassBasic;

public class C0201MethodPractice {
    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
    public static String isPrime (int a) {
        boolean answer = true;
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                answer = false;
                break;
            }
        }
        if (answer == true) {
            return "소수입니다";
        } else {
            return "소수가 아닙니다.";
        }
    }
}

