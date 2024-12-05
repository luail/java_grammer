package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
//        int a = 0;
//        while (a<10){
//            System.out.println("Hello world!");
//            a = a+1;
//        }

////        2~10까지 출력하는 while문 예제
//        int b = 2;
//        while (b < 11) {
//            System.out.println(b);
//            b++;
//        }

////        입력한 숫자의 구구단 단수 출력
////        반복문안의 반복문이 있을경우, 안쪽의 반복문이 다 돌고난 뒤 다시 바깥쪽의 반복문을 실행한다.
//        while (true) {
//            System.out.println("단수를 입력해주세요!");
//            Scanner sc = new Scanner(System.in);
//            long a = sc.nextLong();
//            int b = 1;
//            while (b < 10) {
//                System.out.println( (a) + " x " +(b) + (" = ") + (a * b) );
//                b++;
//            }
//        }

//        도어락키 예제 5번만 반복되게.
//        int count = 0;
//        while (count < 5) {
//            int answer = 1234;
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            if (answer == input) {
//                System.out.println("문이 열렸습니다.");
////                break키워드는 가장 가까이에 있는 반복문을 종료
//                break;
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            count++;
//            if (count == 5) {
//                System.out.println("비밀번호를 5회 이상 틀렸습니다.");
//                break;
//            }
//        }

////        do while문 : 무조건 1번은 실행되는 while문
//        int a = 100;
//        do {
//            System.out.println(a);
//        }
//        while (a<10);

////        for문 : 초기식, 조건식, 증감식이 모두 포함되어 있는 반복문.
//        int b = 2;
//        while (b < 11) {
//            System.out.println(b);
//            b++;
//        }
//
//        for (int a = 2; a < 11; a++) {
//            System.out.println(a);
//        }
////        for문은 사용했던 변수명을 for문 끝난 이후 다음 라인에서 재선언이 가능

////        1~10중에 홀수만 출력하기
//        for (int i = 1; i < 11; i++) {
//            if (i%2 != 0) {
//                System.out.println(i);
//            }
//        }

////        1~20까지 수 중에 짝수를 모두 더한 값
//        int sum = 0;
//        for (int i = 1; i < 21; i++) {
//            if (i%2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

////        두수의 최대 공약수 찾기
//        int a = 24;
//        int b = 36;
//        int min = a < b ? a : b; // a와 b의 값을 모르는 상황일 때 작은 수를 찾는 법.
//        int gcd = 0;
//
//        for (int i =1; i < min; i++) {
//            if (a % i == 0 && b % i == 0) {
//                gcd = i;
//            }
//        }
//        System.out.println(gcd);

////        소수구하기 : 1과 자신을 제외한 숫자로 나누어지지 않는 수.
////        사용자가 입력한 숫자 n이 소수인지 아닌지 판별
//        내가 푼 것.
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//            for (int i = 2; i < n; i++) {
//                if (n % i  == 0) {
//                    System.out.println("소수가 아닙니다.");
//                    break;
//                } else {
//                    System.out.println("소수입니다.");
//                }
//            }
//        }
////          강사님 해답
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean answer = false;
//        for (int i = 2; i*i <= input; i++) {
//            if (input % i == 0) {
//                answer = true;
//                break;
//            }
//        }
//        if (answer == true){
//            System.out.println("소수가 아닙니다.");
//        } else {
//            System.out.println("소수 입니다.");
//        }


////        continue : 반복문의 조건식으로 이동
////        continue를 활용하여 홀수만 출력
//        for (int i = 1; i<11; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

////        배열과 enhanced for문(향상된 for문 or for each문으로 부름.)
//        int[] arr = {1,3,5,7};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
////        일반 for문으로 배열 접근.
//        for (int i = 0; i < 4; i++) {
//            System.out.println(arr[i]);
//        }
////        향상된 for문으로 배열 접근. : a에 arr의 값이 하나씩 담기고, 값의 갯수만큼 반복횟수가 결정.
////        인덱스가 아닌 값으로 접근하는 것.
//        for (int a : arr) {
//            System.out.println(a);
//        }
//
////        일반 for문을 통해 arr의 저장된 값 변경
//        for (int i = 0; i < 4; i++) {
//            arr[i] += 10;
//        }
//        System.out.println(Arrays.toString(arr));
////        향상된 for문을 통해 arr값 변경 시도.
//        for (int a : arr){
//            a += 100;
//        }
//        System.out.println(Arrays.toString(arr));
//
////        자바 변수의 유효범위 : {}
//        int num = 10;
//        if (num>1) {
//            int abc=20;
//            num = 20;
//        }
////        abc = 30; // if문 중괄호 밖에서는 abc변수의 존재를 모름.
//        System.out.println(num);

////        다중반복문
////        2~9단까지 출력 + 각 단마다 몇단입니다. 출력
//        for (int i = 2; i < 10; i++){
//            System.out.println(i + "단 입니다.");
//            for (int j=1; j < 10; j++) {
//                System.out.println(i + " x " + j + " = " + i*j);
//            }
//        }

////        라벨문 : 반복문에 이름을 붙이는 것.
//        boolean end = false;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++){
//                System.out.println("hello world");
//                if (j==2) {
//                    end = true;
//                    break;
//                }
//            }
//            if (end == true){
//                break;
//            }
//        }

        int[][] arr = {{1, 2, 3}, {4,5,11}, {7,8,9}, {10,11,12}};
//        숫자 8을 찾아서 2,1에 있다고 출력
//        숫자 11을 찾되, 가장 먼저 찾아지는 11의 위치만 출력
//
//        loop1:
//        for (int i =0; i < 4; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (arr[i][j] == 11) {
//                    System.out.println(i + ", " + j + "에 있습니다.");
//                    break loop1;
//                }
//            }
//        }

//        100~200까지 수 중에서 가장 작은 소수를 출력
        for (int i = 100; i <= 200; i++) {
            boolean answer = false;
            for (int j = 2; j*j <= i; j++) {
                if (i % j == 0) {
                    answer = true;
                    break;
                }
            }
            if (!answer){
                System.out.println(i);
                break ;
            }
        }
    }
}
