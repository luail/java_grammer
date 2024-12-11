package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {
//        Queue인터페이스를 LinkedList가 구현한 방식을 가장 많이 사용.
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
////        myQue에 데이터를 삭제하면서 가장 앞의 데이터를 반환.
//        System.out.println(myQue.poll());
//        System.out.println(myQue);
////        myQue에 데이터를 삭제하지 않고, 가장 앞의 데이터를 반환.
//        System.out.println(myQue.peek());
//
////        LinkedList와 ArrayList 성능비교
////        중간 위치에 데이터 add테스트
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i <100000; i++) {
//            list1.add(0, 10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("LinkedList 삽입속도 " + (endTime - startTime));
//
//        long startTime2 = System.currentTimeMillis();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        for (int i = 0; i <100000; i++) {
//            list2.add(0, 10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList 삽입속도 " + (endTime2-startTime2));
//
////        조회속도 비교
////        LinkedList 조회
//        long startTime3 = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("LinkedList 조회속도 " + (endTime3-startTime3));
//
////        ArrayList 조회
//        long startTime4 = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            list2.get(i);
//        }
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("ArrayList 조회속도 " + (endTime4-startTime4));

        Queue<String> myQue = new LinkedList<>();
        myQue.add("문서1");
        myQue.add("문서2");
        myQue.add("문서3");
        while (!myQue.isEmpty()) {
            System.out.println(myQue.peek());
            System.out.println(myQue.poll());
        }
        System.out.println(myQue);
//
////        길이제한 Que : ArrayBlockingQueue
//        Queue<String> blockingQue = new ArrayBlockingQueue<>(3);
////        blockingQue.add("문서1");
////        blockingQue.add("문서2");
////        blockingQue.add("문서3");
////        blockingQue.add("문서4");
////        Que에 여유공간이 있을때만 add된다.
//        blockingQue.offer("문서1");
//        blockingQue.offer("문서2");
//        blockingQue.offer("문서3");
//        blockingQue.offer("문서4");
//        System.out.println(blockingQue);

////        우선순위큐 : 데이터를 꺼낼 때 정렬된 데이터가 poll.
////        전체정렬이 아닌, poll할 때 마다 최소값을 보장한다.
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }

//        백준 : 최소힙

//        최대힙인 경우
        Queue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
        maxPq.add(30);
        maxPq.add(10);
        maxPq.add(20);
        System.out.println(maxPq.poll());

    }
}
