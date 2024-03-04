package ex;

import java.util.Scanner;

public class SecArrayEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sub = {"국어", "영어", "수학"};
        System.out.printf("학생수를 입력해주세요 : ");
        int students = sc.nextInt();
        int subject = 3;

        int[] sum = new int[students];
        int[][] value = new int[students][subject];

        for (int i = 0; i < students; i++) {
            System.out.printf("%d번 학생의 성적을 입력해주세요.\n", i + 1);
            for (int j = 0; j < subject; j++) {
                System.out.printf("%d번의 학생의 %s점수를 입력해주세요. : ", i + 1, sub[j]);
                value[i][j] = sc.nextInt();
                sum[i] += value[i][j];
            }
        }

        for (int i = 0; i < students; i++) {
            System.out.printf("%d번 학생의 총점 : %d, 평균 : %.1f\n", i + 1, sum[i], (double) sum[i] / subject);
        }
    }
}
