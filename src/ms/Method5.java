package ms;

public class Method5 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("체인지 넘버 호출 전 num1 : " + num1);
        changeNumber(num1);
        System.out.println("체인지 넘버 호출 후 num1 : " + num1);
    }
    public static void changeNumber (int num1) {
        System.out.println("체인지 넘버 호출 전 num2 : " + num1);
        num1 *= 2;
        System.out.println("체인지 넘버 호출 후 num2 : " + num1);
    }
}
