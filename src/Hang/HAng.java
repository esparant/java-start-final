package Hang;

public class HAng {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;
        longValue = intValue;
        doubleValue = longValue;

        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(doubleValue);

        // int < long < double 순으로 크다.

        doubleValue = 20L; // 이게 더크기때문에 L 도 붙여서 가능하다.
        System.out.println("doubleValue = " + doubleValue);

    }
}
