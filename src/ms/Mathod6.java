package ms;

public class Mathod6 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println(num1);
        num1 = changeNumber(num1);
        System.out.println(num1);
    }
    public static int changeNumber (int num1) {
        System.out.printf("%d을 곱합니다.\n", num1);
        return num1 * 2;
    }
}
