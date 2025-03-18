package controlstatement;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachClass {
    public static void main(String[] args) {
        /*
        // 기존 for문
        String[] numbers = {"one", "two", "three"};
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
         */
        // for each문
        String[] numbers = {"one", "two", "three"};
        for(String number: numbers) {
            System.out.println(number);
        }
        System.out.println("------------------------");
        // ArrayList 예제
        ArrayList<String> numbers2 = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for (String number : numbers2) {
            System.out.println(number);
        }

    }
}
