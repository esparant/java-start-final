package ms;

public class MathodandHang {
    public static void main(String[] args) {
        double db = 1.61;
        printNumber((int)db); // ( 명시적 형변환)

        int i = 1;
        imDobule(i); // 자동 형변환


    }
    public static void printNumber(int n) {
        System.out.println(n);
    }

    public static void imDobule(double i) {
        System.out.println("i = " + i);
    }
}
