package ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] values = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.printf("%d개의 정수를 받습니다.\n", values.length);
        for (int i = 0; i < values.length; i++) {
            System.out.printf("%d번째 값을 입력해주세요. : ", i + 1);
            values[i] = sc.nextInt();
        }
        System.out.println("받은 5개의 정수를 출력합니다.");
        for(int i = 0; i < values.length; i++) {
            System.out.printf("%d", values[i]);
            if(i < values.length - 1) { // 이거 좀 중요하다잉
                System.out.printf(", ");
            }
        }
    }
}
