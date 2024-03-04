package ex;

public class Opex {
    public static void main(String[] args) {
        int score = 85;
        String str;
        if(score >= 90) {
            str = "A";
        } else if (score >= 80) {
            str = "B";
        } else if (score >= 70) {
            str = "C";
        } else if (score >= 60) {
            str = "D";
        } else str = "F";

        System.out.println("str = " + str);

    }
}
