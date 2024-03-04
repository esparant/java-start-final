package ms;

public class Overloading3 {
    public static void main(String[] args) {

        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(2.2, 3.3));
        System.out.println("3: " + add(3.3, 4));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    } // 이자식을 지워도 밑에놈이 자동 형변환으로 커버가 가능하기때문에
    // 전부 호출 가능!
    // 메소드의 타입이 달라도 메소드 시그니쳐가 다르기에 ㄱㅊ!!
    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
