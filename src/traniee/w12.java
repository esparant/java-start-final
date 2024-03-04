package traniee;

import java.util.Scanner;

public class w12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 숫자 사이에 수들을 출력합니다.");
        System.out.printf("첫번째 숫자를 입력해주세요. : ");
        int i = sc.nextInt();
        System.out.printf("두번째 숫자를 입력해주세요. : ");
        int z = sc.nextInt();
        if (i > z) {
            int temp = z;
            z = i;
            i = temp;
            i++;
        } else i++; System.out.printf("%d 와 %d 사이의 숫자는 다음과 같습니다.\n", i, z);
        for (; i < z; i++) {
            System.out.printf("%d", i);
            if (i != z - 1) {
                System.out.printf(",", i);
            }
        }
    }
}
