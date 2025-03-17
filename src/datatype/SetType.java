package datatype;

import java.util.Arrays;
import java.util.HashSet;

public class SetType {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);  //  [e, H, l, o] 출력
        /*
        * 집합 자료형의 2가지 큰 특징
        * - 중복을 허용하지 않는다
        * - 순서가 없다(unordered)
        *
        * 맵 자료형 역시 순서가 없는 자료형이라 인덱싱을 지원하지 않는다.
        *
        * 집합 자료형은 중복을 허용하지 않기 때문에 자료형의 중복을 제거하기 위한 필터 역할로 종종 사용
        *
        * 집합 자료형은 교집합, 합집합, 차집합을 구할 때 유용
        */
        System.out.println("---------------");
        // 제네릭스로 int 를 사용하고 싶다면 int 의 Wrapper 클래스인 Integer 를 대신 사용
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        // retainAll 메서드를 이용하면 교집합을 쉽게 구할 수 있다.
        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
        intersection.retainAll(s2);  // 교집합 수행
        System.out.println(intersection);  // [4, 5, 6] 출력

        System.out.println("---------------");
        // 합집합은 addAll 메서드를 사용한다.
        HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
        union.addAll(s2); // 합집합 수행
        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력

        System.out.println("---------------");
        // 차집합은 removeAll 메서드를 사용한다.
        HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract);  // [1, 2, 3] 출력
    }
}
