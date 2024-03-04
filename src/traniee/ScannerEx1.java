package traniee;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("당신의 이름을 입력해주세요. : ");
        String str = sc.nextLine();
        System.out.printf("당신의 나이를 입력해주세요. : ");
        int toshi = sc.nextInt();
        System.out.printf("당신의 이름은 : %s, 당신의 나이는 : %d살", str, toshi);
    }
}
