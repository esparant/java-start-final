package ex;

import java.util.Scanner;

public class Sanner5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("상품의 가격을 입력하세요. (-1을 입력하면 종료.) : ");
            int value = sc.nextInt();
            if (value == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.printf("상품의 개수를 입력해주세요. : ");
            int quaintity = sc.nextInt();
            System.out.printf("총가격은 %d 원입니다.\n", value * quaintity);


        }

    }
}
