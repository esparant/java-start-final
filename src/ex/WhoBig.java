package ex;

public class WhoBig {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int big = (a > b) ? a : b;
        System.out.println("big = " + big);
    }
}
