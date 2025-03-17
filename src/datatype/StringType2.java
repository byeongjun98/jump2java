package datatype;

import java.util.Arrays;

public class StringType2 {
    public static void main(String[] args) {
        String s = "Hello World";
        String t = "a:b:c:d";
        String[] result = t.split(":");
        System.out.println(s.indexOf("World"));
        System.out.println(s.contains("World"));
        System.out.println(s.charAt(6));
        System.out.println(s.replaceAll("World", "JAVA"));
        System.out.println(s.substring(0,6));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(result);

        System.out.println("------------------");
        int apple = 3;
        System.out.println(String.format("사과는 %d 개입니다.", apple));
        System.out.println("------------------");
        int number = 10;
        String day = "three";
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));

        System.out.println("------------------");
        System.out.println(String.format("I eat %d apples.", 3));
        System.out.printf("I eat %d apples.", 3);  // "I eat 3 apples." 출력

        /*
        * String.format: 문자열 리턴
        * System.out.printf: 문자열 출력
        * */
    }
}
