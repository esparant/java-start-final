package ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "HAlo";
        msg(message, 3);

    }

    public static void msg(String msg, int kai) {
        for (int i = 1; i <= kai; i++) {
            System.out.println(msg);
        }
    }
}
