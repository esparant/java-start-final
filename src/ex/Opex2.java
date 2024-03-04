package ex;

public class Opex2 {
    public static void main(String[] args) {
        int kyori = 133;
        String str;
        if(kyori <= 1) {
            str = "도보";
        } else if(kyori <= 10) {
            str = "자전거";
        } else if(kyori <= 100 ) {
            str = "자동차";
        } else str = "비행기";
        System.out.println("str = " + str);
        
        }
}
