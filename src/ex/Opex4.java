package ex;

public class Opex4 {
    public static void main(String[] args) {
        String[] str = {"어바웃타임", "토이 스토리", "고질라"};
        double rating = 8.3;
        if (rating >= 9) {
            System.out.println(str[0] + "을(를) 추천합니다.");

        }
        if (rating >= 8) {
            System.out.println(str[1] + "을(를) 추천합니다.");
        }
        if (rating >= 7) {
            System.out.println(str[2] + "을(를) 추천합니다.");
        }
    }
}
