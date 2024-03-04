package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 의 생존일기
        if (true) {
            int x = 20; // 생존시작
            System.out.println("m = " + m);
            System.out.println("x = " + x);
        } // x 생존종료
    } // m 생존종료
}
