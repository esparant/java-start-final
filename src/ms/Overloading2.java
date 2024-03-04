package ms;

public class Overloading2 {

    public static void main(String[] args) {
        myMethod(1, 2.22);
        myMethod(1.2, 3);
    }

    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }
    // 매개변수 시그니쳐 = 메소드이름 매개변수 타입
    // 컴퓨터가 각각 메소드의 매개변수 타입을 보고 자동으로 올바른 메소드를 찾는다.

    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }
}
