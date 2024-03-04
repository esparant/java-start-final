package ex;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int cnt = 0;
        System.out.println("숫자를 입력해주세요. (입력을 중단하려면 -1을 입력하세요)");
        int value;
        while ((value = sc.nextInt()) != -1) { // 괄호 한번 더쳐주는 거 중요
            // 괄호 없이 쓰면 복잡해보이니까? 자바가 햇갈려함
            sum += value;
            cnt ++;
        }
        System.out.printf("입력한 수의 값의 합 : %.0f, 평균 : %.1f", sum, (double)sum/cnt);
    }
}
