package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // 임시로 사용할놈인데 굳이 main 괄호안에
        // 생성할 필요는 없다.
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);

    }
}
