package Hang;

public class Hang4 {
    public static void main(String[] args) {
        int div = 3 / 2;
        double dou = 3 / 2;
        System.out.println("dou = " + dou);
        // 값을 계산하고 double 로 형변환함.
        double dou2 = 3.0 / 2;
        System.out.println("dou2 = " + dou2);
        double dou3 = (double) 3 / 2;
        System.out.println("dou3 = " + dou3);
        double dou4 = 3 / 2.0;
        System.out.println("dou4 = " + dou4);
        double dou5 = 3 / (double) 2;
        System.out.println("dou5 = " + dou5);
        // 같은 타입끼리의 계산은 같은 타입의 결과가 나타남
        // int + long 은 자동으로 형변환 발생
        // int + double 도 똑같다.

    }
}
