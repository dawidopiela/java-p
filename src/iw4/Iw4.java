package iw4;

public class Iw4 {
    public static void main(String[] args) {
        double number = 0.3333333333333333;
        boolean isNormalized = true;
        if (number > 1 || number < 0){
            isNormalized = false;
        }
        System.out.println(isNormalized);
    }
}
