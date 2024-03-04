package Hang;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Hang3 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intVaule = 0;
        intVaule = (int) doubleValue; // 큰타입에서 작은 타입은
        // 직접 항변환을 시켜야한다.

        // 값 손실이 발생하기 때문에 웬만한 상황아니면 안쓰는 게 좋다.

        System.out.println("intVaule = " + intVaule);

        long maxIntValue = 2147483647;
        long maxIntOver = 2134839420383L;
        // Long 에는 int 의 최고값까지 L 없이 들어갈 수 있지만.
        // 그것을 넘는다면 끝에 L을 붙여줘야함.
        System.out.println("maxIntOver = " + maxIntOver);
        int intValue = 0;

        intValue = (int) maxIntOver;
        System.out.println("intValue = " + intValue);
        // int 의 가장 작은 -값 부터 다시 시작함.
        // 이런 현상을 overflow 라고 한다.




    }
}
