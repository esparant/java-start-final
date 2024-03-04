package ex;

public class Loopex {
    public static void main(String[] args) {
        int cnt = 0;
        System.out.println("while 문의 반복문입니다.");
        while (cnt <= 20) {
            if (cnt % 2 == 1) {
                cnt++;
                continue;
            }
            System.out.println(cnt);
            cnt++;
        }
        System.out.println("for 문의 반복문입니다.");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
        int sum = 0;
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        for (int i =2, count = 1; count <= 10; i += 2, count++) { // 여러개 선언도 가능하다
            System.out.println(i);
        }

        int max = 100;
        sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);





    }
}
