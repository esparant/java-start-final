package ex;

import java.util.Scanner;

public class Sncanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        while (true) {
            System.out.printf("이름을 입력하세요.(종료를 입력하면 종료) : ");
            name = sc.nextLine(); // nextLine 으로 하면 엔터까지 입력받아서 next로 해야한다.
            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.printf("나이를 입력하세요.: ");
            int toshi = sc.nextInt();

            sc.nextLine(); // 아니면 넥스트라인을 하나 더 추가해서 받은 값을 버려라.
            System.out.printf("당신이 입력한 이름은 : %s, 나이는 : %d\n", name, toshi);

        }
    }
}
