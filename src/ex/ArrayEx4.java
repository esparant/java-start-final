package ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] values = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.printf("%d개의 정수를 받습니다.\n", values.length);
        for (int i = 0; i < values.length; i++) {
            System.out.printf("%d번째 값을 입력해주세요. : ", i + 1);
            values[i] = sc.nextInt();
            sum += values[i];
        }
        System.out.println("받은 5개의 정수를 출력합니다.");
        System.out.printf("입력한 수의 합 : %d\n입력한 수의 평균 : %.1f", sum, (double)sum/values.length);

//
//        for(int i = 0; i < values.length; i++) {
//            System.out.printf("%d", values[i]);
//            if(i < values.length - 1) { // 이거 좀 중요하다잉
//                System.out.printf(", ");
//            }
//        }
    }
}
