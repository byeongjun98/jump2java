package controlstatement;

import java.util.ArrayList;

public class IfClass {
    public static void main(String[] args) {
        int money = 2000;
        boolean hasCard = true;

        if (money >= 3000 || hasCard) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }

        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("paper");
        pocket.add("handphone");
        pocket.add("money");

        System.out.println("--------------------");
        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        }else if(hasCard) {
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");
        }
    }
}
