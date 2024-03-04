package ms;

public class Mathod3 {
    public static void main(String[] args) {
        boolean result = bl(2);
        System.out.println(result);
    }

    public static boolean bl(int i) {
        if (i % 2 == 1) {
            return true;
        } else return false; // if 문을 사용했다면
        // 무조건 반환하 수 있도록 해야함.
    }


}
