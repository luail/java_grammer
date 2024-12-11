package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
////        map은 index요소가 없으므로, 순서가 무의미하다.
////        key값은 중복되지 않고, 만약 동일한 key값으로 디른 value를 넣으면 value를 덮어쓰기함.
//        Map<String, String> sports = new HashMap<>();
//        sports.put("basketball", "농구");
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("baseball", "공놀이");
//        System.out.println(sports);
//
////        map은 key를 통해 value를 get
////        map에서 key값을  통한 복잡도는 0(1)
//        System.out.println(sports.get("basketball"));
//
////        map의 전체 데이터 조회
////        keySet() : map의 key목록을 리턴하는 메서드
////        values() : map의 value목록을 리턴하는 메서드
//        for (String key : sports.keySet()) {
//            System.out.println(key);
//            System.out.println(sports.get(key));
//        }
//
////        remove : 키를 통해 삭제.
//        sports.remove("baseball");
//        System.out.println(sports);
//
////        putIfAbsent : key값이 없는 경우에만 put
//        sports.putIfAbsent("soccer", "운동");
//        sports.putIfAbsent("baseball", "야구");
//        System.out.println(sports);
//
////        getOrDefault : key가 없으면 default값으로 return
//        System.out.println(sports.get("pingpong"));
//        System.out.println(sports.getOrDefault("baseball", "그런키없음"));
//
////        containsKey : 키가 있으면 true 키가 없으면 false
//        System.out.println(sports.containsKey("baseball"));
//        System.out.println(sports.containsKey("pingpong"));
//
//        String[] arr = {"농구", "축구", "농구", "야구", "축구"};  //다시 해보자.
////        농구:2, 축구:2, 야구:1
//        Map<String, Integer> sports = new HashMap<>();
//        for (String n : arr) {
//            sports.put(n, sports.getOrDefault(n,0)+1);
//        }
//        System.out.println(sports);

//        완주하지 못한 선수 - 프로그래머스

//        의상 - 프로그래머스

////        LinkedHashMap : 데이터 삽입순서를 보장(유지)
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("Hello5", 1);
//        linkedMap.put("Hello4", 2);
//        linkedMap.put("Hello3", 3);
//        linkedMap.put("Hello2", 4);
//        linkedMap.put("Hello1", 5);
//
//        for (String l : linkedMap.keySet()) {
//            System.out.println("키 값은 " + l);
//        }


////        TreeMap : key를 통해 데이터를 정렬
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("Hello5", 1);
//        treeMap.put("Hello4", 2);
//        treeMap.put("Hello3", 3);
//        treeMap.put("Hello2", 4);
//        treeMap.put("Hello1", 5);
//
//        for (String l : treeMap.keySet()) {
//            System.out.println("키 값은 " + l);
//        }


////        HashMap을 사용해서 key값으로 정렬.
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("Hello5", 1);
//        myMap.put("Hello4", 2);
//        myMap.put("Hello3", 3);
//        myMap.put("Hello2", 4);
//        myMap.put("Hello1", 5);
//        List<String> myList = new ArrayList<>();
//        for (String a : myMap.keySet()) {
//            myList.add(a);
//        }
//        myList.sort(Comparator.naturalOrder());
//
//        for (String l : myList) {
//            System.out.println("키 값은 " + l);
//            System.out.println("밸류 값은 " + myMap.get(l));
//        }
//        Collections.sort(myList, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return myMap.get(o2) - myMap.get(o1);
//            }
//        });
//        System.out.println(myList);

//        hashMap 출력방법 2가지 : 1.향상된 for문    2.iterater
        Map<String, String> myMap = new HashMap<>();
        myMap.put("basketball", "농구");
        myMap.put("soccer", "축구");
        myMap.put("baseball", "야구");
//        for (String a : myMap.keySet()) {
//            System.out.println(a);
//        }

        Iterator<String> myIters = myMap.keySet().iterator();
//        next메서드는 데이터를 하나씩 소모시키면서 값을 반환
        System.out.println(myIters.next());
//        hasNext는 Iterater안에 그 다음 값이 있는지 없는지 boolean return
//        그 다음값이 있을때까지 반복을 하겠다.
        while (myIters.hasNext()) {
            System.out.println(myIters.next());
        }

//        더 맵게 - 프로그래머스

////        stack
//        Stack<Integer> st = new Stack<>();
//        st.push(10);
//        st.push(20);
//        st.push(30);
//        System.out.println(st.pop());
//        System.out.println(st.peek());
//        System.out.println(st.size());
//        System.out.println(st.isEmpty());
//
//        while (!st.isEmpty()) {
//            System.out.println(st.pop());
//        }

//        같은 숫자는 싫어 - 프로그래머스

//        Deque : addFirst, addLast, pollFirst, pollLast
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addLast(10);
        d1.addLast(20);
        System.out.println(d1);
        d1.addFirst(30);
        System.out.println(d1);
        System.out.println(d1.peekFirst()); //30
        System.out.println(d1.peekLast());  //20
        System.out.println(d1.pollLast());  //20
        System.out.println(d1.peekFirst());  //30

//        올바른 괄호 - 프로그래머스 (다시 풀어보기)
    }
}
