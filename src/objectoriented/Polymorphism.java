package objectoriented;

interface Predator2 {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
}

interface Barkable {
    void bark();
}

interface BarkablePredator extends Predator2, Barkable {
}

class Animal5 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger2 extends Animal5 implements Predator2, Barkable {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion2 extends Animal5 implements BarkablePredator {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeeper2 {
    void feed(Predator2 predator) {
        System.out.println("feed " + predator.getFood());
    }
}

class Bouncer {
    void barkAnimal(Barkable animal) {
        animal.bark();
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Tiger2 tiger = new Tiger2();
        Lion2 lion = new Lion2();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}