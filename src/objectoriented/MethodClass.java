package objectoriented;

// 입력값 ---> 메서드(블랙박스와 같은 역할을 한다.) ----> 리턴값

public class MethodClass {
    // 입력값과 리턴값이 모두 있는 메서드
    int sum(int a, int b){ // a, b는 매개변수(parameter)
        return a + b;
    }

    // 입력값이 없는 메서드
    String say(){
        return "Hi";
    }

    // 리턴값이 없는 메서드
    void sum2(int a, int b){
        System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다.");
    }

    // 입력값과 리턴값이 모두 없는 메서드
    void say2(){
        System.out.println("Hi!!");
    }

    // 리턴의 또 다른 쓰임
    void sayNick(String nick) {
        if ("바보".equals(nick)) {
            return;
        }
        System.out.println("나의 별명은 "+nick+" 입니다.");
    }

    // 메서드의 return 활용하여 메인 메서드 외부 값 제어
    int varTest(int a) {
        a++;
        return a;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int d = 1;

        MethodClass mc = new MethodClass();
        int c = mc.sum(a, b); // 여기서 a, b는 인수(arguments)
        System.out.println(c);
        System.out.println("-------------");

        String s = mc.say();
        System.out.println(s);
        System.out.println("-------------");

        mc.sum2(a, b);
        System.out.println("-------------");

        mc.say2();
        System.out.println("-------------");

        mc.sayNick("야호!");
        mc.sayNick("바보");
        System.out.println("-------------");

        d = mc.varTest(d);
        System.out.println(d);

        /* 메서드에서 쓰이는 매개 변수의 이름과 메서드 밖의 변수 이름이 같더라도 서로 전혀 영향을 주지 않는다.
        Ex)
        public class Sample {
            void varTest(int a) {
                a++;
            }

            public static void main(String[] args) {
                int a = 1;
                Sample sample = new Sample();
                sample.varTest(a);
                System.out.println(a);
            }
        }
        출력: 1
         */
    }
}
