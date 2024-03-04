package inx;

public class SecondArray2 {
    public static void main(String[] args) {
        int[][] arr = new int[10][6];

        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num++;
            }
        }

        for (int[] i : arr) {  //iter
            for (int j : i) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }

    }
}
