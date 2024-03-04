package ms;

public class Method1 {
    public static void main(String[] args) {
        int result = add(1, 3);
        // 인수는 1, 3 처럼 넘길값을 말함!! 실무에서는 아규먼트, 인수, 인자 라는 용어를 사용
        // 매개변수는 int a int  b 처럼 매서드 안에 들어있는 타입!! 실무에서 매개변수, 파라미터 전부 사용
        // 매개와 변수의 합성어로 메서드 호출부와 메서드 내부 사이에서
        //값을 전달하는 역할하는 변수!!
        // 즉 인수가 매개변수안에 들어감 다고 생각하면 됨.
        System.out.println(result);
        System.out.printf("%d", add(24, 3)); //이렇게도 가능
    }

    private static int add(int a, int b) { // 호출하는 순간 메모리가 할당됨
        // 호출이 끝나면 메소드는 사라짐.
        //메서드 이름, 반환타입, 파라미더(매개변수) 목록을 포함.
        System.out.printf("%d + %d = ", a, b);
        return a + b;
    }
}
// public : 다른 클래스에서 호출할 수 있는 메서드라는 뜻 접근제어에서 배움
// static : 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻
// 뒤에서 배운다.



