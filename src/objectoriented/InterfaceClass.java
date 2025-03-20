package objectoriented;

interface Predator {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
}

class Animal4 {
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Tiger extends Animal4 implements Predator {
    public String getFood() {
        return "apple";
    }
}

class Lion extends Animal4 implements Predator {
    public String getFood() {
        return "banana";
    }
}

class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed "+predator.getFood());
    }

}
public class InterfaceClass {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }
}
