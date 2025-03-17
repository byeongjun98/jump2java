package datatype;

import java.util.ArrayList;
import java.util.HashMap;

public class MapType {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people"));
        // 맵에 해당 key가 없을때 null이 return 되는데 default 값을 지정하고자 한다면 getOrDefault 메서드 사용
        System.out.println(map.getOrDefault("java", "자바"));  // "자바" 출력
        System.out.println(map.containsKey("people"));  // 해당 key가 존재하는지 true, false 리턴
        System.out.println(map.remove("people"));  // 해당 key의 항목 삭제 후 value 리턴
        System.out.println(map.size()); // 맵 요소의 갯수 리턴
        System.out.println(map.keySet());  // 맵의 모든 key를 집합 자료형으로 리턴

        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList); // 맵의 모든 키를 리스트 자료형으로 리턴

        /*
        * 맵의 가장 큰 특징은 순서에 의존하지 않고 key로 value를 가져오는 것
        * Map에 입력된 순서대로 데이터를 가져오거나 입력한 key에 의해 정렬(sort)하도록 저장시에는  LinkedHashMap과 TreeMap을 사용
        * LinkedHashMap : 입력된 순서대로 데이터를 저장한다.
        * TreeMap : 입력된 key의 오름차순으로 데이터를 저장한다.
        */





    }
}
