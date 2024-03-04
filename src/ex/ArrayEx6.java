package ex;


import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] values;
        int max = 0, mini = 0;
        Scanner sc = new Scanner(System.in);

        System.out.printf("입력받을 숫자의 개수를 입력하세요 : ");
        int number = sc.nextInt();
        values = new int[number];

        System.out.printf("%d개의 숫자를 입력받겠습니다.\n", number);
        for (int i = 0; i < number; i++) {
            System.out.printf("%d번째의 값을 입력해주세요. : ", i + 1);
            values[i] = sc.nextInt();
            if (i == 0) {
                max = values[0];
                mini = values[0];
            }
            if(max < values[i]) {
                max = values[i];
            }
            if (mini > values[i]){
                mini = values[i];
            }
        }
        System.out.printf("가장 큰 정수: %d\n가장 작은 정수: %d", max, mini);
    }
}
