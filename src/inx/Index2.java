package inx;

public class Index2 {
    public static void main(String[] args) {
        int[] test = new int[2];
        test[0] = 1;
        // test 의 참조값에 접근해서 인텍스를 사용해서 해다위치 요소에 접근.
        // 즉 test의참조값 I@어쩌구[0] 이라는 것.

        // 자바의 기본형이란 int long double boolean
        // 참조형이란 배열같이 int[] ~ 와 같이 데이터에 접근하기위한
        // 주소를 저장하는 타입.

        int[] students = {90, 80, 70, 60, 50};

        for (int i : students) {
            System.out.println(i);
        }


    }
}
