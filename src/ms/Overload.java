package ms;

public class Overload {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
    }
    // 매개변수의 갯수에 따라 컴퓨터가 인식하므로
    // 이름을 똑같이 가능하다.
    // 이것을 오버로드라고함


    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, int b, int c) {
        System.out.println("2번 호출");
        return c + b + c;
    }




}
