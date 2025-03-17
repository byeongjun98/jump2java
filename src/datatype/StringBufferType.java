package datatype;

public class StringBufferType {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");
        sb.append("!");
        sb.append(" ");
        sb.append("jump to java");
        String result = sb.toString();
        System.out.println(result);

        System.out.println("-------------------");
        String result2 = "";
        result2 += "Hello World";
        result2 += "!";
        result2 += " ";
        result2 += "jump to java";
        System.out.println(result2);

        System.out.println("-------------------");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("hello");
        sb3.append(" ");
        sb3.append("jump to java");
        String result3 = sb3.toString();
        System.out.println(result3);

        /*
        * immutable: 값 변경 불가
        * mutable: 값 변경 가능

        * StringBuffer 는 String 보다 무겁다. 메모리 사용량이 많고 속도가 느리다.
        * 문자열 추가 및 변경이 잦다면 StringBuffer, 그렇지 않다면 String 사용

        * StringBuffer 는 멀티 스레드 환경에서 안전, StringBuilder는 성능이 우수
        * 동기화를 고려한다면 StringBuffer, 동기화를 고려하지 않는다면 StringBuilder
        * */

        System.out.println("-------------------");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("jump to java");
        sb4.insert(0, "hello ");
        System.out.println(sb4);

        System.out.println("-------------------");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("jump to java");
        System.out.println(sb5.substring(0, 4));

    }
}
