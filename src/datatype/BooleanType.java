package datatype;

public class BooleanType {
    public static void main(String[] args) {
        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        if (isTall) {
            System.out.println("Tall");
        }
        if(!isTall) {
            System.out.println("Not Tall");
        }

        System.out.println("----------------------");
        int i = 3;
        boolean isOdd = i % 2 == 1;
        System.out.println(isOdd);
    }
}
