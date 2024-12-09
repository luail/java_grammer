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

        String[] arr = {"농구", "축구", "농구", "야구", "축구"};  //다시 해보자.
//        농구:2, 축구:2, 야구:1
        Map<String, Integer> sports = new HashMap<>();
        for (String n : arr) {
            sports.put(n, sports.getOrDefault(n,0)+1);
        }
        System.out.println(sports);

//        완주하지 못한 선수 - 프로그래머스


    }
}
