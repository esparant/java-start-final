package ms;

public class Method4 {
    public static void main(String[] args) {
        checkAge(24);
        checkAge(19);
    }
    public static void checkAge(int i) {
        if(i >= 20) {
            System.out.println(i + "살이기 때문에, 당신은 출입이 가능합니다.");
            return;
        } // return 을 if 문에 입력함으로써 바로 생략가능 else 필요없음.

        System.out.println(i + "살이기 때문에, 미성년자는 출입이 불가능합니다.");
    }
}
