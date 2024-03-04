package ex;

import java.util.Scanner;

public class Scanner78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = 0;
        int sum = 0;
        while (true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램종료");
            button = sc.nextInt();

            if (button == 1) {
                sc.nextLine(); // 줄넘김 방지
                System.out.printf("상품 입력을 입력하세요. : ");
                String str = sc.nextLine();

                System.out.printf("상품 가격을 입력하세요 : ");
                int value = sc.nextInt();

                System.out.printf("상품 개수을 입력하세요 : ");
                int kazu = sc.nextInt();

                sum += value * kazu;
                System.out.printf("상품명: %s, 가격: %d, 개수: %d\n", str, value, kazu);

            } else if (button == 2) {
                System.out.println("총비용 : " + sum + "원");
                sum = 0;
            } else if (button == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else System.out.println("올바른 값을 입력해주세요.");
        }
    }
}
