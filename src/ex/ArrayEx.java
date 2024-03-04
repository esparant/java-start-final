package ex;

public class ArrayEx {
    public static void main(String[] args) {


        int[] Students = {60, 70, 80, 90, 100};
        int sum = 0;

        for (int student : Students) {
            sum += student;
        }
        System.out.printf("점수 총합 : %d\n점수 평균: %d", sum, sum / Students.length);

    }
}
