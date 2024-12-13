package C02ClassBasic;

public class C0208RecursiveBasic {
    public static void main(String[] args) {
//      for문으로 1~10까지 누적합계
        int sum = 0;
        for (int i = 1; i <11; i++) {
            sum+= i;
        }
        System.out.println(sum);
//        재귀함수로 1~10까지 누적합계
        System.out.println(sumAcc(10));

//        factorial 값 구하기
//        factorial(5) -> 1*2*3*4*5
        System.out.println(facto(5));


//        피보나치 수열
//        1 1 2 3 5 8 13
        int[] fibo = new int[11];
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        System.out.println("fibo는 " + fibo[9]);



        System.out.println("fibonacci는 " + fibonacci(10));
    }

    public static int sumAcc(int n) {
        if (n==1) {
            return 1;
        }
        return n+sumAcc(n-1);
    }

    public static int facto(int n) {
        if (n == 1) {
            return 1;
        }
        return n*facto(n-1);
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
