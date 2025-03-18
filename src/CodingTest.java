public class CodingTest {
    public static void main(String[] args) {
        int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(num[0][1]);

    }
    class Solution {
        public int[][] solution(int[] num_list, int n) {
            int row = num_list.length / n; // 행 개수 계산
            int[][] answer = new int[row][n]; // 2차원 배열 초기화

            for (int i = 0; i < row; i++) { // 행(row) 반복
                for (int j = 0; j < n; j++) { // 열(column) 반복
                    answer[i][j] = num_list[i * n + j]; // 1차원 배열 요소를 2차원 배열에 할당
                }
            }
            return answer;
        }
    }
}
