package datatype;

public class EnumType {
    enum CoffeeType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO);
        System.out.println(CoffeeType.ICE_AMERICANO);
        System.out.println(CoffeeType.CAFE_LATTE);
        for(CoffeeType coffeeType : CoffeeType.values()){
            System.out.println(coffeeType);
        }
    }
}
