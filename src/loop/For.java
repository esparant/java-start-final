package loop;

public class For {
    public static void main(String[] args) {
        int endnum = 10;
        int sum = 0;
        for (int i = 1; ; i++) {
            System.out.println(sum += i);
            if (sum > 10) break;
        }

        // for(;;){} // 이렇게 하면 무한반복코드
    }
}
