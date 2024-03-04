package ms;

public class Method2 {
    public static void main(String[] args) {
        printHello();
        // String test = printHello(); 매개변수가 없는데 이렇게 할당하면 오류남.
        String a = printTest("응가뿌지직");
        System.out.println(a);
        System.out.println(1.2 + 0.1 == 0.2);
    }

    public static void printHello() { // 매개변수가 없는 경우.
        System.out.println("프로그램을 시작합니다.");
        // void 는 return 생략
        return; // 이걸 자바가 알아서 넣어줌 입력안해도.
    }
    public static String printTest(String str) {
        System.out.println("프로그램을 시작합니다.");
        return str;
    }
}
