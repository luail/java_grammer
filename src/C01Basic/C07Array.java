package C01Basic;

import java.util.Arrays;

public class C07Array {
    public static void main(String[] args) {
////        배열표현식1. 리터럴방식
//        int[] intArr1 = {1,3,5,7,9};
//
////        배열표현식2. 배열선언 후 할당방식.
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 3;
//        intArr2[2] = 5;
//        intArr2[3] = 7;
//        System.out.println(intArr2[4]); // 0으로 초기화
//
////        참조자료형의 배열은 기본적으로 null초기화
//        String[] stArr = new String[5];
//        stArr[0] = "hello1";
//        stArr[1] = "hello2";
//        stArr[2] = "hello3";
////        아래코드는 NullPointerException발생
//        for (int i = 0; i<stArr.length; i++) {
//            if (stArr[i].equals("hello10")){
//                System.out.println("hello10이 있습니다.");
//            }
//        }
//
////        표현식3
//        int[] intArr3 = new int[]{1,3,5,7,9};
//        List<int[]> list1 = new ArrayList<>();
//        list1.add(new int[]{1,2,3,4,5});

////        표현식4 : 불가 -> 배열긔 길이가 사전 지정되어야함.
//        int[] intArr4 = new int[];
//
//        String[] stArr = new String[5];
//        for (int i = 0; i <stArr.length; i++) {
//            stArr[i] = "";
//        }
//        Arrays.fill(stArr, "hello");
//        System.out.println(Arrays.toString(stArr));

////        85,65,90인 int배열을 선언하고, 총합, 평균을 구하자.
//        int[] nums = {85, 65, 90};
//        int sum = 0;
//        int avg = 0;
//        for (int i = 0; i<nums.length; i++) {
//            sum += nums[i];
//        }
//
//        avg = sum / nums.length;
//
//        System.out.println(sum);
//        System.out.println(avg);

////        배열의 최대값, 최소값
//        int[] arr2 = {10,20,30,12,8,17};
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i<arr2.length; i++) {
//            if (max < arr2[i]) {
//                max = arr2[i];
//            }
//            if (min > arr2[i]) {
//                min = arr2[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);

////        배열의 자리 바꾸기
//        int[] arr = {20,10,30};
//        int temp = arr[0];
//        arr [0] = arr[1];
//        arr [1] = temp;

//        int[] arr2 = {10,20,30,40,50};
//        for (int i = 0; i < arr2.length-1; i++) {
//            int temp2 = arr2[i];
//            arr2[i] =arr2[i+1];
//            arr2[i+1] = temp2;
//        }
//        System.out.println(Arrays.toString(arr2));

////        배열뒤집기 : 새로운 배열 선언하여, arr을 뒤집을 배열 생성
//        int[] arr = {10,20,30,40,50};
//        int[] arr2 = new int[arr.length];
//        arr2[arr2.length-1] = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            arr2[i-1] = arr[(arr.length-i)];
//        }
//        System.out.println(Arrays.toString(arr2));

////        배열의 정렬
//        int[] arr = {17,12,20,10,25};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

////        선택정렬 알고리즘 구현 (다시 해보기)
//        int[] arr = {17,12,20,10,25};
//        for (int i = 0; i < arr.length-1; i++){
//            int min = arr[i];
//            int minIndex = i;
//            for (int j = i+1; j < arr.length; j++) {
//                if (min > arr[j]) {
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        문자정렬
//        아스키코드(unicode)기준으로 정렬
//        String[] fruits = {"banana", "apple", "cherry"};
////        오름차순
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//
//        String[] fruits2 = {"apple", "applee", "applef", "b"};
//        Arrays.sort(fruits2);
//        System.out.println(Arrays.toString(fruits2));



////        내림차순 : 기본형타입은 Comparator로 처리 불가.
//        Arrays.sort(fruits, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(fruits));
//        int[] arr = {5, 1, 2, 3, 6};
////        Arrays.sort(arr, Comparator.reverseOrder());
//        Arrays.sort(arr);


//        k 번째수 프로그래머스 못풀음 다시 풀어라!

////        숫자 조합의 합.
////        모두 각기 다른 숫자의 배열이 있을 때, 만들어질 수 있는 2개의 조합의 합을  출력.
//        int[] intArr = {10, 20, 30, 40, 50, 60};
//        int[] newArr = new int[(intArr.length-1) * intArr.length];
//        int index = 0;
//        for (int i = 0; i < intArr.length-1; i++) {
//            for (int j = i+1; j < intArr.length; j++) {
//                int sum = intArr[i] + intArr[j];
//                newArr[index] = sum;
//                index++;
//            }
//        }
//        int[] arr2 = new int[index];
//        for (int i = 0; i < index; i++){
//            arr2[i] = newArr[i];
//        }
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
//
//        int count = 0;
//        int[] answer = new int[arr2.length];
//        for (int i = 0; i < arr2.length-1; i++) {
//            if (arr2[i] != arr2[i+1]) {
//                answer[count] = arr2[i];
//                count++;
//            }
//        }
//        answer[count] = arr2[arr2.length-1];
//        count++;
//        System.out.println(Arrays.toString(answer));
//
////        배열의 복사
////        Arrays.copyOf(배열명 length),Arrays.copyOfRange(배열명, start, end)
//        int[] answer1 = Arrays.copyOf(answer, count);
//        System.out.println(Arrays.toString(answer1));
//        int[] answer2 = Arrays.copyOfRange(answer,0,count);

//        두 개 뽑아서 더하기- 프로그래머스 (다시 풀어보자)

////        배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int target = 8;
//        int targetIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (target == arr[i]) {
//                targetIndex = i;
//                break;
//            }
//        }
//        System.out.println(targetIndex);

////        이진검색(binary search) - 이분탐색 (백준 1920번 문제)
////        사전에 오름차순 정렬이 되어 있어야 이진검색 가능.
//        int[] arr = {1,3,6,8,9,11,15};
//        System.out.println(Arrays.binarySearch(arr,13));
//
////        배열 간 비교.
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1 == arr2);
////        Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1, arr2));

//        2차원 배열의 선언과 할당.
//        int[][] arr1 = new int[2][3];
//        arr1[0][0] = 10;
//        arr1[0][1] = 20;
//        arr1[0][2] = 30;
//        arr1[1][0] = 40;
//        arr1[1][1] = 50;
//        arr1[1][2] = 60;
//        int[][] arr2 = {{10,20,30}, {40,50,60}};

////        가변배열 선언 후 할당.
//            int[][] arr1 = new int[2][];
//            arr1[0] = new int[2];
//            arr1[1] = new int[3];
//            arr1[0][0] = 10;
//            arr1[0][1] = 20;
//            arr1[1][0] = 30;
//            arr1[1][1] = 40;
//            arr1[1][2] = 50;
//        System.out.println(Arrays.deepToString(arr1));

////        가변배열 리터럴 방식.
//            int[][] arr2 = {{10,20},{30,40,50}};

////        [3][4] 사이즈 배열 선언하고
////        1~12까지 숫자값을 각 배열에 순차적으로 할당.
//        int[][] intArr = new int[3][4];
//        int count = 1;
//        for (int i = 0; i < intArr.length; i++){
//            for (int j = 0; j < intArr[i].length; j++) {
//                intArr[i][j] = count;
//                count++;
//            }
//        }
//        System.out.println(Arrays.deepToString(intArr));

////      동적배열일 경우.
//
//        int[][] intArr = new int[3][];
//        int count = 1;
//        for (int i = 0; i < intArr.length; i++){
//            intArr[i] = new int[4];
//            for (int j = 0; j < intArr[i].length; j++) {
//                intArr[i][j] = count;
//                count++;
//            }
//        }
//        System.out.println(Arrays.deepToString(intArr));

//        행렬의 덧셈 - 프로그래머스
    }
}
