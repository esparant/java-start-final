package ex;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int cnt = 0;
        System.out.println("숫자를 입력해주세요. (입력을 중단하려면 -1을 입력하세요)");
        while (true) {
            int value = sc.nextInt();
            if (value == -1) {
                System.out.println("프로그램을 종료합니다.");
                System.out.printf("입력한 수의 값의 합 : %.0f, 평균 : %.1f", sum, (double)sum/cnt);
                break;
            }
            sum += value;
            cnt ++;

        }
    }
}
