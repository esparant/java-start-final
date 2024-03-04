package codingtest;

public class oo {
    public static void main(String[] args) {
        String[] test = {"1111 22222", "3333 5555", "66666 44534"};


        for(int i = 0; i < test.length; i ++ ){

            String[] save = test[i].split(" ");
            System.out.println("save[0] = " + save[0]);
            System.out.println("save[0] = " + save[1]);
        }
    }

}
