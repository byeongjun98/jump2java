package datatype;

import java.util.Arrays;

public class ArrayType {
    public static void main(String[] args) {
        int[] odds = {1, 3, 5, 7, 9};
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        String[] weeks2 = new String[7];
        weeks2[0] = "월";
        weeks2[1] = "화";
        weeks2[2] = "수";
        weeks2[3] = "목";
        weeks2[4] = "금";
        weeks2[5] = "토";
        weeks2[6] = "일";
        System.out.println(Arrays.toString(odds));
        System.out.println(Arrays.toString(weeks));
        System.out.println(Arrays.toString(weeks2));
        /*
        * 초기값 없이 배열 변수 생성시 배열 크기 설정 필수
        * Ex) String[] weeks = new String[];    // 길이에 대한 숫자값이 없으므로 컴파일 오류가 발생한다.
         */
        System.out.println("--------------");
        String[] weeks3 = {"월", "화", "수", "목", "금", "토", "일"};
        System.out.println(weeks3[3]);

        System.out.println("--------------");
        String[] weeks4 = {"월", "화", "수", "목", "금", "토", "일"};
        /* for 문 1
        for (int i = 0; i < weeks4.length; i++) {
            System.out.println(weeks4[i]);
        }
        */
        // for 문 2
        for (String s : weeks4) {
            System.out.println(s);
        }

        /*
        * 배열 오류
        * ArrayIndexOutOfBoundsException
        * Ex) System.out.println(weeks[7]);  // 여덟 번째 배열값이 없으므로 ArrayIndexOutOfBoundsException 오류 발생
        */

    }
}
