package traniee;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        while (true) {
            System.out.println("0을 입력하면 프로그램이 종료되고 지금까지 더한 값이 나옵니다.");
            System.out.println("더하고 싶은 정수를 모두 입력해주세요.");
            System.out.printf("%d 번째 정수를 입력해주세요. : ", i);
            int intVaule = sc.nextInt();
            i++;
            sum += intVaule;
            if (intVaule == 0) {
                System.out.println("프로그램을 종료합니다.");
                System.out.println("당신이 입력한 값을 모두 더하면 : " + sum);
                break;
            }
        }
    }
}
