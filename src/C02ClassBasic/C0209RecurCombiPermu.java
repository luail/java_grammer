//package C02ClassBasic;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class C0209RecurCombiPermu {
//    public static void main(String[] args) {
////        //      1,2,3,4가 있을 때
////        List<Integer> myList= new ArrayList<>();
////
////        myList.add(1);
////        myList.add(2);
////        myList.add(3);
////        myList.add(4);
////        List<List<Integer>> answer= new ArrayList<>();
//
//        //myList로 만들 수 있는 2개짜리 숫자 조합을 이중리스트에 담아서 출력
//        //[1,2] [1,3] [1,4] [2,3] [2,4] [3,4]
//
//
//        //for문으로 진행
////        for (int i=0; i<myList.size(); i++){            // 첫 번째 숫자
////            for (int j=i+1; j<myList.size(); j++){      // 두 번쨰 숫자
////                List<Integer> temp = new ArrayList<>();
////                temp.add(myList.get(i));
////                temp.add(myList.get(j));
////                answer.add(temp);
////            }
////        }
////
////        //      재귀로 바꾸기 위해서
////        List<Integer> temp = new ArrayList<>();
////
////        for (int i=0; i<myList.size(); i++){
////            temp.add(myList.get(i));                // 첫 번째 숫자
////            for (int j=i+1; j<myList.size(); j++){
////                temp.add(myList.get(j));            // 두 번쨰 숫자
////                answer.add(new ArrayList<>(temp));
////                temp.remove(temp.size()-1);
////            }
////            temp.remove(temp.size()-1);
////        }
////        System.out.println(answer);
//
//        //      다시 풀어보기(혼자한 것)
////        int count=0;
////        for(int i=0; i<count; i++){
////
////            for(int j = 0; j<myList.size()-1;j++){
////                if(myList.get(j).equals(myList.get(j+1))) {
////                    myList2.get(i).add(j);
////                    myList2.get(i).add(j+1);
////                    count++;
////                }
////            }
////
////        }
//
//
//        //      재귀함수 호출을 통한 조합리스트 만들기
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        List<List<Integer>> answer = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        combi(answer, temp, myList, 3, 0);
//        System.out.println(answer);
//        System.out.println(answer.size());
//        answer = new ArrayList<>();
//        permu(answer, temp, myList, 2, new boolean[myList.size()]);
//        System.out.println(answer);
//        System.out.println(answer.size());
//
//        //      N과M(15649) 백준
//
////        //      로또(6603) : 백준
////        //      강사님 풀이.
////        import java.io.BufferedReader;
////    import java.io.IOException;
////    import java.io.InputStreamReader;
////    import java.util.*;
////
////
////        public class Main {
////            public static void main(String[] args) throws IOException {
////                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////                while(true){
////                    String[] temp = br.readLine().split(" ");
////                    if(temp[0].equals("0"))break;
////                    int[] arr = new int[temp.length-1];
////                    for(int i=1; i<temp.length; i++){
////                        arr[i-1] = Integer.parseInt(temp[i]);
////                    }
////                    combi(arr, 0, 0, new int[6]);
////                    System.out.println();
////                }
////            }
////            public static void combi(int[]arr, int depth, int start, int[] answer){
////                if(depth==6){
////                    StringBuilder sb = new StringBuilder();
////                    for(int a : answer){
////                        sb.append(a);
////                        sb.append(" ");
////                    }
////                    sb.deleteCharAt(sb.length()-1);
////                    System.out.println(sb);
////                    return;
////                }
////                for(int i=start; i<arr.length; i++){
////                    answer[depth] = arr[i];
////                    combi(arr, depth+1, i+1, answer);
////                }
////            }
////
////        }
////
////
////    }
//
//    }public static void combi (List < List < Integer >> answer, List < Integer > temp,
//                List < Integer > myList,int count, int start){
//            if (count == temp.size()) {
//                answer.add(new ArrayList<>(temp));
//                return;
//            }
//            for (int i = start; i < myList.size(); i++) {
//                temp.add(myList.get(i));
//                // 두 번쨰 숫자
//                combi(answer, temp, myList, count, i + 1);
//
//                temp.remove(temp.size() - 1);
//
//            }
//
//        }
//        public static void permu (List < List < Integer >> answer, List < Integer > temp,
//                List < Integer > myList,int count, boolean[] visited){
//            if (count == temp.size()) {
//                answer.add(new ArrayList<>(temp));
//                return;
//            }
//
//
//            for (int i = 0; i < myList.size(); i++) {
//                System.out.println(Arrays.toString(visited));
//                if (!visited[i]) {
//                    visited[i] = true;
//                    temp.add(myList.get(i));
//
//                    permu(answer, temp, myList, count, visited);
//
//                    temp.remove(temp.size() - 1);
//                    visited[i] = false;
//
//                }
//
//            }
//
//        }
//
//    }
//}