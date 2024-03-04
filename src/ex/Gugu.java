package ex;

public class Gugu {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            System.out.println(i + "단 시작");
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
        int rows = 3;
        for(int i = 1; i <= rows; i++) {
            System.out.println();
            for(int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
        }
    }
}
