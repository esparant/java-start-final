package inx;

public class SecondArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        }; // 이게 보기 편하다?! (잘모름)
        for (int[] i : arr) { //iter
            for (int j : i) {
                System.out.println("j = " + j);
            }
        }
        System.out.println(arr.length);
        System.out.println(arr[arr.length - 1].length);

    }
}

