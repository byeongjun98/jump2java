package datatype;

public class TypeCasting {
    public static void main(String[] args) {
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);
        System.out.println("--------------------");

        int k = 123;
        String num1 = "" + k;
        System.out.println(num1);
        System.out.println("--------------------");

        String num2 = String.valueOf(k);
        String num3 = Integer.toString(k);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println("--------------------");

        String floatNum = "123.456";
        double doubleNum = Double.parseDouble(floatNum);
        System.out.println(doubleNum);
        System.out.println("--------------------");

        int n1 = 123;
        double d1 = n1;
        System.out.println(d1);

        double d2 = 123.456;
        int n2 = (int)d2;
        System.out.println(n2);

        /*
        * 실수 형태의 문자열을 정수로 바꿀 때는 NumberFormatException 이 발생하므로 주의
        * Ex)
          public class Sample {
            public static void main(String[] args) {
            String num = "123.456";
            int n = Integer.parseInt(num);  // 실수 형태의 문자열을 정수로 변환할 경우 NumberFormatException 이 발생한다.
                }
            }
        * 실수 형태의 문자열을 숫자형으로 바꾸려면 Double.parseDouble()을 이용해 실수로 바꾼 후 사용
        */

        // final
    }
}
