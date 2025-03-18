package objectoriented;

// 입력값 ---> 메서드(블랙박스와 같은 역할을 한다.) ----> 리턴값

public class MethodClass {
    int sum(int a, int b){ // a, b는 매개변수(parameter)
        return a + b;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        MethodClass mc = new MethodClass();
        int c = mc.sum(a, b); // 여기서 a, b는 인수(arguments)

        System.out.println(c);
    }
}
