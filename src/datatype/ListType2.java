package datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListType2 {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>();  // 제네릭스를 사용한 표현
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches);  // [138, 129, 142] 출력

        System.out.println("-------------");
        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches2);  // [138, 129, 142] 출력

        System.out.println("-------------");
        // String 배열 대신 String 자료형을 여러 개 전달하여 생성
        ArrayList<String> pitches3 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches3);

        System.out.println("-------------");
        // ArrayList 의 각 요소를 , 로 구분하여  문자열로 출력
        ArrayList<String> pitches4 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = "";
        for (int i = 0; i < pitches4.size(); i++) {
            result += pitches4.get(i);
            result += ",";  // 콤마를 추가한다.
        }
        result = result.substring(0, result.length() - 1);  // 마지막 콤마는 제거한다.
        System.out.println(result);  // 138,129,142 출력

        System.out.println("-------------");
        //String.join을 사용하면 더 간단하게 처리
        ArrayList<String> pitches5 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result2 = String.join(",", pitches5);
        System.out.println(result2);  // 138,129,142 출력

        System.out.println("-------------");
        // 문자열 배열에서 String.join() 사용
        String[] pitches6 = new String[]{"138", "129", "142"};
        String result3 = String.join(",", pitches6);
        System.out.println(result3);  // 138,129,142 출력

        System.out.println("-------------");
        // 리스트 정렬
        ArrayList<String> pitches7 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches7.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println(pitches7);  // [129, 138, 142] 출력
        /*
        * 오름차순(순방향) 정렬 - Comparator.naturalOrder()
        * 내림차순(역방향) 정렬 - Comparator.reverseOrder()
        */
    }
}
