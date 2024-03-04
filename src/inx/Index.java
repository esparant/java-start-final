package inx;

public class Index {
    public static void main(String[] args) {
        int[] students; // 배열을 만든것 뿐 길이는 정하지않음
        students = new int[5];  // 길이 생성.
        //
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        int[] test = new int[5];// new int는 그냥 int형 5개 만든다는 의미
        // 아무런 뜻 없음.
        System.out.println("test = " + test); // 참조값
        // [I@b4c966a I 는 int를 뜻하며 @ 뒤로는 참조값의 16진수 주소이다.

        System.out.println("students[4] = " + students[4]);
    }
}
