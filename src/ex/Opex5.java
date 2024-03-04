package ex;

import java.sql.SQLOutput;

public class Opex5 {
    public static void main(String[] args) {
        String grade = "A";
        switch (grade) {
            case "A" -> System.out.println("탁월한 성과입니다!");
            case "B" -> System.out.println("좋은 성과입니다.");
            case "C" -> System.out.println("좋은 성과입니다.");
            default -> System.out.println("불합격입니다.");
        }
    }
}
