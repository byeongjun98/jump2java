package objectoriented;

/*
* 객체와 인스턴스의 차이
Animal cat = new Animal() 이렇게 만들어진 cat 은 객체.
cat 이라는 객체는 Animal 의 인스턴스.
인스턴스라는 말은 특정 객체(여기서는 cat)가 어떤 클래스(여기서는 Animal)의 객체인지를 관계 위주로 설명할 때 사용된다.
‘cat 은 인스턴스’보다는 ‘cat 은 객체’, ‘cat 은 Animal 의 객체’보다는 ‘cat 은 Animal 의 인스턴스’
*/

class Animal{
    String name;

    public void setName(String name){
        this.name = name;
    }
}
public class ObjectClass {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("boby");
        System.out.println(cat.name);

        Animal dog = new Animal();
        dog.setName("happy");
        System.out.println(dog.name);
    }
}
