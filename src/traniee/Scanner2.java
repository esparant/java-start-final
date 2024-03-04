package traniee;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 값을 입력해주세요. : ");
        int num1 = sc.nextInt();

        System.out.print("두번째 값을 입력해주세요. : ");
        int num2 = sc.nextInt();

        System.out.println("두 숫자의 합 : " + (num1 + num2));

        System.out.print("가장 큰 숫자 : ");
        if (num1 == num2) {
            System.out.println("두 숫자가 같습니다.");
        } else System.out.println(num1 > num2 ? num1 : num2);


    }
}
