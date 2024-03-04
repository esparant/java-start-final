package traniee;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("첫번째 숫자와 두번째 숫자 모두 \"0\"을 입력하면 프로그램을 종료합니다. ");
            System.out.print("첫번째 정수를 입력해주세요. : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 정수를 입력해주세요. : ");
            int num2 = sc.nextInt();
            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("두숫자의 합 : " + (num1 + num2));
        }
    }
}
