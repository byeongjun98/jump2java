package objectoriented;

/*
* 자바에서 만드는 모든 클래스는 Object 클래스를 상속받는다.
* 사실 우리가 만든 Animal 클래스는 다음 코드와 기능적으로 완전히 동일하다.
* 하지만 굳이 다음 코드처럼 Object 클래스를 상속하도록 코딩하지 않아도 자바에서 만들어지는 모든 클래스는 Object 클래스를 자동으로 상속받게끔 되어 있다.
*
* 자바는 다중 상속을 지원하지 않는다.
*/

class Animal2 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal2 {
    void sleep() {
        System.out.println(this.name+" zzz");
    }// Animal 클래스를 상속한다.
}

class HouseDog extends Dog {
    // 메서드 오버라이딩
    // 부모 클래스의 메서드를 자식 클래스가 동일한 형태로 또다시 구현하는 행위를 메서드 오버라이딩(method overriding)
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }
    // 메서드 오버로딩
    // 입력 항목이 다른 경우 동일한 이름의 메서드를 만들 수 있는데 이를 메서드 오버로딩(method overloading)
    void sleep(int hour) {
        System.out.println(this.name+" zzz in house for " + hour + " hours");
    }
}

public class InheritanceClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
        System.out.println("--------------------");

        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();  // happy zzz 출력
        houseDog.sleep(1);

    }
}
