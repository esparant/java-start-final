package traniee;

import java.util.Scanner;

public class Scanner54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("음식 이름을 입력해주세요 : ");
        String str = input.nextLine();
        System.out.printf("음식 가격을 입력해주세요. : ");
        int value = input.nextInt();
        System.out.printf("음식 수량을 입력해주세요. : ");
        int i = input.nextInt();
        System.out.printf("%s(을)를 주문했습니다. %d개 주문하셨으며, 총가격은 %d원입니다.",str, i, value * i);
        // 변수이름 한번에 바꾸는 꿀팁 ! cltl w 로 지정하고 쉬프트 f6 !!

    }
}
