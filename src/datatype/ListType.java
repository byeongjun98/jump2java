package datatype;

import java.util.ArrayList;

public class ListType {
    public static void main(String[] args) {
        // ArrayList pitches = new ArrayList();
        // 자바 J2SE 5.0 버전부터 객체를 포함하는 자료형은 어떤 객체를 포함하는지 명확하게 표현할 것을 권고
        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(0, "133");    // 첫번째 위치에 133 삽입.
        pitches.add(1, "133");

        System.out.println(pitches);
        System.out.println(pitches.get(0));
        System.out.println(pitches.size());
        System.out.println(pitches.contains("142"));
        System.out.println(pitches.remove("129"));  // 129를 리스트에서 삭제하고, true 를 리턴한다.
        System.out.println(pitches.remove(0));  // pitches 의 첫 번째 항목이 138이므로, 138을 삭제한 뒤 138을 리턴한다.

        /*
        * 제네릭스(generics)는 자바 J2SE 5.0 버전 이후에 도입된 개념으로, 자료형을 안전하게 사용할 수 있도록 만들어 주는 기능
        * 제네릭스를 사용하면 자료형을 강제로 바꿀 때 생길 수 있는 캐스팅 오류를 줄일 수 있다.
        * 일반적인 방식 : ArrayList<String> pitches = new ArrayList<String>();
        * 선호되는 방식 : ArrayList<String> pitches = new ArrayList<>(); (뒷 부분의 자료형은 명확하므로 굳이 적지 않아도 된다.)
        * J2SE 5.0 이후 버전에서는 제네릭스를 사용하지 않고 코드를 작성해도 오류는 나지 않는다. 다만, 제네릭스 자료형을 명확하게 지정하라는 경고 메시지가 출력
        *
        * 제네릭스를 사용하지 않으면 ArrayList에 추가하는 객체는 Object 자료형으로 인식된다.
        * Object 자료형은 모든 객체가 상속하고 있는 가장 기본적인 자료형이다.
        * 따라서 ArrayList 객체인 pitches에 값을 넣을 때는 문제가 없지만 값을 가져올 때는 매번 Object 자료형에서 String 자료형으로 형 변환(casting) 을 해야 한다.
        */
        System.out.println("--------------");
        System.out.println("제네릭스 미사용 예시");
        ArrayList pitches2 = new ArrayList();
        pitches2.add("138");
        pitches2.add("129");

        String one = (String) pitches.get(0); // Object 자료형을 String 자료형으로 형 변환
        String two = (String) pitches2.get(1);

        System.out.println("--------------");
        System.out.println("제네릭스 사용 예시");

        ArrayList<String> pitches3 = new ArrayList<>();
        pitches3.add("138");
        pitches3.add("129");

        String one1 = pitches3.get(0);  // 형 변환이 필요없다.
        String two2 = pitches3.get(1);  // 형 변환이 필요없다.
        /*
        * 이처럼 제네릭스를 이용하면 형 변환과 관련된 불필요한 코딩을 줄일 수 있고, 잘못된 형 변환 때문에 발생하는 런타임 오류를 방지할 수 있다.
        */

    }
}
