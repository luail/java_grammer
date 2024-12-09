package C01Basic;

import java.util.*;

public class C08List {
    public static void main(String[] args) {
////        List선언방법
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
////        가장 일반적인 list 선언 방식.
//        List<String> myList3 = new ArrayList<>();
//
////        초기값 생성방법1. 하나씩 add
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("C++");
//
////        초기값 생성방법2. 배열을 리스트로 변환한다.
//        String[] arr = {"java", "python", "C++"};
//        List<String> myList = new ArrayList<>(Arrays.asList(arr));
//
//        int[] intArr = {10,20,30,40,50};
//        List<Integer> intList = new ArrayList<>();
//        for (int i : intArr) {
//            intList.add(i);
//        }

////        add메서드
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        System.out.println(myList);
//        myList.add(0,30);
//        System.out.println(myList);
//        List<Integer>myList2 = new ArrayList<>();
//        myList2.addAll(myList);
//
////        get(index) 특정 index의 요소를 반환
//        System.out.println(myList.get(0));
//
////        size() : 리스트의 개수 반환
//        System.out.println(myList.size());
//
////        for문을 활용해 list의 값 하나씩 모두 출력
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//
//        for (int a : myList) {
//            System.out.println(a);
//        }

////          remove : 요소삭제
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        System.out.println(myList);
////        1)index를 통해 삭제 2)value를 통해 삭제
//        myList.remove(0);
//        System.out.println(myList);
//        myList.remove(Integer.valueOf(20));
//        System.out.println(myList);
////        set(index, value) 인덱스 위치 자리에 value값 setting(변경)
//        myList.set(0, 50);
//        System.out.println(myList);
//
////        clear : 요소 전체 삭제
//        System.out.println(myList.isEmpty());
//        myList.clear();
//        System.out.println(myList.isEmpty());
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(20);
//        myList.add(30);
////        indexof : 가장 먼저 나오는 값의 index return;
//        System.out.println(myList.indexOf(20));

//        n의 배수 고르기 - 프로그래머스

////        리스트 정렬 : Collections.sort(), 객체명.sort()
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//
////        방법1. Collections.sort();
//        Collections.sort(myList);
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
//
////        방법2. 객체명.sort()
//        myList.sort(Comparator.naturalOrder());
//        System.out.println(myList);
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);

////        이중리스트 : 리스트안의 리스트
////        {1,2,3}, {10,20}, {100,200,300,400}
//        List<List<Integer>> myList = new ArrayList<>();
//        myList.add(new ArrayList<Integer>());
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//        myList.get(0).add(1);
//        myList.get(0).add(2);
//        myList.get(0).add(3);
//        myList.get(1).add(10);
//        myList.get(1).add(20);
//        myList.get(2).add(100);
//        myList.get(2).add(200);
//        myList.get(2).add(300);
//        myList.get(2).add(400);
//        System.out.println(myList);

////        리스트안의 배열
//        List <int[]> myList2 = new ArrayList<>();
//        myList2.add(new int[2]);
//        myList2.get(0)[0]=10;
//        myList2.get(0)[1]=20;
//        myList2.add(new int[3]);
//        myList2.get(1)[0]=100;
//        myList2.get(1)[1]=200;
//        myList2.get(1)[2]=300;
//        myList2.add(new int[]{1,2});
//        myList2.add(new int[]{1,2,3,4});
//        for (int[] a : myList2) {
//            System.out.println(Arrays.toString(a));
//        }

//        contains : 값이 있는지 여부를 리턴.
        List<Integer>myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        if (myList.contains(10)) {
            System.out.println("10이 있습니다.");
        }
    }
}
