package datatype;

import java.util.Arrays;
import java.util.HashSet;

public class SetType2 {
    public static void main(String[] args) {
        // add 메서드는 집합 자료형에 값을 추가할 때 사용한다.
        HashSet<String> set = new HashSet<>();
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);  // [Java, To, Jump] 출력

        System.out.println("----------------");
        // 값을 한꺼번에 여러 개 추가할 때는 addAll 메서드를 사용한다.
        HashSet<String> set2 = new HashSet<>();
        set2.add("Jump");
        set2.addAll(Arrays.asList("To", "Java"));
        System.out.println(set2);  // [Java, To, Jump] 출력

        System.out.println("----------------");
        // remove 메서드는 특정 값을 제거할 때 사용한다.
        HashSet<String> set3 = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
        set3.remove("To");
        System.out.println(set3);  // [Java, Jump] 출력

        /*
        * TreeSet : 값을 오름차순으로 정렬해 저장한다.
        * LinkedHashSet : 값을 입력한 순서대로 정렬한다.
        */
    }
}
