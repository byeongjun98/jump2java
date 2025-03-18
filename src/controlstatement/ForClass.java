package controlstatement;

public class ForClass {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};
        for(String number : numbers) {
            System.out.println(number);
        }
        System.out.println("-------------");

        int[] marks = {90, 25, 67, 45, 80};
        for(int i = 0; i < marks.length; i++) {
            if (marks[i] >= 60) {
                System.out.println((i+1)+"번 학생은 합격입니다.");
            }else {
                System.out.println((i+1)+"번 학생은 불합격입니다.");
            }
        }
        System.out.println("-------------");

        for(int i=0; i<marks.length; i++) {
            if (marks[i] < 60) {
                continue;  // 조건문으로 돌아간다.
            }
            System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
        }
        System.out.println("-------------");

        for(int i=2; i<10; i++) {
            for(int j=1; j<10; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");  // 줄을 바꾸어 출력하는 역할을 한다.
        }

    }
}
