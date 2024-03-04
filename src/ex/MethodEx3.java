package ex;

import java.util.Scanner;

public class MethodEx3 {
    static int zenbu = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("1 : 입금 | 2 : 출금 | 3 : 잔액확인 | 4 : 종료");
            System.out.println("-----------------------------------------");
            System.out.printf("번호: ");
            int button = sc.nextInt();
            switch (button) {
                case 1 -> {
                    orosuMoney();
                }
                case 2 -> {
                    hurikomuMoney();
                }
                case 3 -> {
                    showMoney();
                }
                case 4 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return; // 이거 중요.
                }
                default -> System.out.println("올바른 숫자를 입력해주십시오.");
            }
        }
    }
 // 변수는 보통 명사로 시작 메서드는 동사로시작!! (중요)
    public static void showMoney() {
        System.out.println("잔액 : " + zenbu + "원");
    }

    public static void orosuMoney() {
        showMoney();
        System.out.println("입금하실 금액을 입력해주세요.");
        int money = sc.nextInt();
        zenbu += money;
        System.out.println(money + "원을 입금하였습니다.");
        System.out.println("현재 잔액 : " + zenbu + "원");
    }

    public static void hurikomuMoney() {
        showMoney();
        System.out.println("출금하실 금액을 입력해주세요.");
        int money = sc.nextInt();

        if (zenbu < money) {
            System.out.println(money + "원을 출금하려 했으니 잔액이 부족합니다.");
            System.out.println("현재 잔액 : " + zenbu + "원");
        } else {
            System.out.println(money + "원을 출금하셨습니다.");
            zenbu -= money;
            System.out.println("현재 잔액 : " + zenbu + "원");
        }
    }
}
