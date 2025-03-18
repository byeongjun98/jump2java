package objectoriented;

class Calc {
    int result = 0;

    int add(int num) {
        result += num;
        return result;
    }

    int sub(int num) {
        result -= num;
        return result;
    }
}
public class Calculator {
   public static void main(String[] args) {
       Calc cal1 = new Calc();  // 계산기1 객체를 생성한다.
       Calc cal2 = new Calc();  // 계산기2 객체를 생성한다.

       System.out.println(cal1.add(3));
       System.out.println(cal1.add(4));
       System.out.println(cal1.sub(5));

       System.out.println(cal2.add(3));
       System.out.println(cal2.add(7));
       System.out.println(cal2.sub(5));
   }
}
