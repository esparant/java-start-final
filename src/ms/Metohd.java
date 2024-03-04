package ms;

public class Metohd {
    public static void main(String[] args) {

    }
    private static int add(int a, int b) {
        // 메서드 본문 실행 코드
        System.out.printf("%d + %d = ", a, b);
        return a + b;
    }
    // 제어자 public, static 등등
    // 반환타입 return 타입 메서드 값을 반환하지 않은 경우에는 void
    // 매개변수 메서드 내부에서 사용할 수있는 변수
    // 없는 경우에는 그냥 add()이런 식으로 해도됨
}
