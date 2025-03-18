package datatype;

/*
* final은 자료형에 값을 단 한 번만 설정할 수 있게 강제하는 키워드
*/
public class FinalType {
    public static void main(String[] args) {

        /*
        * 컴파일 에러 예시
        final int n = 123;
        n = 456; // 컴파일 에러 발생
        *
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        a = new ArrayList<>(Arrays.asList("c", "d"));  // 컴파일 에러 발생
        *
        * 리스트의 경우 final로 선언할 때 리스으에 값을 더하거나 뺄 수 있다. 재할당만 불가능
        * 만약 값을 더하거나 빼는것도 할 수 없게 하고 싶다면 List.of를 작성하여 수정할 수 없는 리스트(unmodifiable list) 사용
        * 예시
        final List<String> a = List.of("a", "b");
        a.add("c");  // UnsupportedOperationException 발생
        */
        System.out.println("Hello final");

    }
}
