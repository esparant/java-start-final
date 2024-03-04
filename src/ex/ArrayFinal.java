package ex;

import java.util.Scanner;

public class ArrayFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int macValue = 1;
        int cnt = 0;
        String[][] list = new String[macValue][2];

        while (run) {
            System.out.println("1. 상품등록 | 2. 상품목록 | 3. 종료");
            System.out.printf("메뉴를 입력하세요. : ");
            int button = sc.nextInt();
            sc.nextLine(); // 줄바꿈 방지
            switch (button) {
                case 1 -> {
                    if (cnt == macValue) {
                        System.out.println("상품을 더 등록할 수 없습니다.");
                        continue;
                    }
                    System.out.printf("상품 이름을 입력하세요. : ");
                    list[cnt][0] = sc.nextLine();
                    System.out.printf("상품 가격을 입력하세요. : ");
                    list[cnt][1] = sc.nextLine();
                    cnt++;
                }
                case 2 -> {
                    for (int i = 0; i < macValue; i++) {
                        if (list[i][0] == null) {
                            continue;
                        }
                        System.out.printf("%d. %s: %s원\n", i + 1, list[i][0], list[i][1]);
                    }
                }
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    run = false;
                    break;
                }
                default -> System.out.println("올바른 값을 입력하세요.");
            }
        }
    }
}
