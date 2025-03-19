package objectoriented;

class Animal3 {
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Dog3 extends Animal3{
    void sleep(){
        System.out.println(this.name + " zzz");
    }
}

class HouseDog2 extends Dog3{
    
    HouseDog2(String name) {
        this.setName(name);
    }
    HouseDog2(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }
    
    void sleep(){
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour){
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}
public class ConstructorClass {
    public static void main(String[] args) {
        HouseDog2 houseDog2 = new HouseDog2("happy");
        HouseDog2 yorkshire = new HouseDog2(1);
        System.out.println(houseDog2.name);
        System.out.println(yorkshire.name);
//        houseDog2.setName("happy");
//        houseDog2.sleep();
//        houseDog2.sleep(1);
    }
}
