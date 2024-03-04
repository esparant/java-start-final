package ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int number = 4;
        int[] kokugo = new int[number];
        int[] math = new int[number];
        int[] eng = new int[number];
        int[] sum = new int[number];


        for (int i = 0; i < number; i++) {
            System.out.printf("%d번 학생의 성적을 입력하세요.\n", i + 1);
            System.out.printf("%d번 학생의 국어 점수 : ", i + 1);
            kokugo[i] = sc.nextInt();
            sum[i] += kokugo[i];

            System.out.printf("%d번 학생의 수학 점수 : ", i + 1);
            math[i] = sc.nextInt();
            sum[i] += math[i];

            System.out.printf("%d번 학생의 영어 점수 : ", i + 1);
            eng[i] = sc.nextInt();
            sum[i] += eng[i];

        }
        for (int i = 0; i < number; i++) {
            System.out.printf("%d번 학생의 총점 : %d\n", i + 1, sum[i]);
            System.out.printf("%d번 학생의 평균 : %.1f\n", i + 1, (double) sum[i] /3);

        }
    }
}
