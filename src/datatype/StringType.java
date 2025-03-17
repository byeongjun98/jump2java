package datatype;

public class StringType {
    public static void main(String[] args) {

        //  리터럴 표기법
        String a = "Happy Java";
        String b = "a";
        String c = "123";
        String d = new String("Happy Java");
        /*
        String a = new String("Happy Java");
        String b = new String("a");
        String c = new String("Happy Java");
        */
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        /*
        원시(primitive) 자료형
        - int, long, double, float, boolean, char.
        - new 키워드로 값 생성 불가 -> 리터럴 표기 방식으로 세팅.
        - String 은 리터럴 표기법을 사용할 수 있지만 원시 자료형에 포함되지 않는다.

        Wrapper 클래스
        - int -> Integer
        - long -> Long
        - double -> Double
        - float -> Float
        - boolean -> Boolean
        - char -> Character
        - 멀티 스레드 환경에서 동기화를 지원하려면 원시 자료형 대신 Wrapper 클래스를 사용해야 한다.
         */
        System.out.println("----------------------");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(a == d);
    }
}
