package traniee;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요 : ");
        int i = sc.nextInt();
        System.out.printf("%d는 ", i);
        System.out.printf(i % 2 == 0 ? "짝수" : "홀수");
        System.out.printf("입니다.");

    }
}
