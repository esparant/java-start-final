package ex;

public class MethodEx1 {
    public static void main(String[] args) {
        System.out.printf("%.1f\n",aver(1, 2, 3));
        System.out.printf("%.1f\n",aver(15, 25, 25));
    }
    public static double aver(int a, int b, int c) {
        return a + b + c / (double) 3;
    }
}
