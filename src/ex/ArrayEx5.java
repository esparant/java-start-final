package ex;


import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] values;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.printf("입력받을 숫자의 개수를 입력하세요 : ");
        int number = sc.nextInt();
        values = new int[number];

        System.out.printf("%d개의 숫자를 입력받겠습니다.\n", number);
        for (int i = 0; i < number; i++) {
            System.out.printf("%d번째의 값을 입력해주세요.", i + 1);
            values[i] = sc.nextInt();
            sum += values[i];
        }
        System.out.printf("입력받은 값의 합: %d\n입력받은 값의 평균 : %.1f", sum, (double)sum / number);
    }
}
