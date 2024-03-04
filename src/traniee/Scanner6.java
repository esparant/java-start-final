package traniee;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("원하는 구구단 숫자를 입력해주세요. : ");
        int z = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            if (i == 1) {
                System.out.printf("%d단의 구구단입니다.\n", z);
            }
            System.out.printf("%d * %d = %d\n", z, i, z * i);
        }
    }
}
