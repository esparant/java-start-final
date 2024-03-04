package loop;

public class do_while {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
