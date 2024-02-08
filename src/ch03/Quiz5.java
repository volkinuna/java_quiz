package ch03;

public class Quiz5 {
    public static void main(String[] args) {

        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = ((lengthTop + lengthBottom) * height / 2.0);
        System.out.println(area);

        // ➊ (lengthTop+lengthBottom) * height / 2.0  <- O
        // ➋ (lengthTop+lengthBottom) * height * 1.0 / 2 <- O
        // ➌ (double)(lengthTop+lengthBottom) * height / 2 <- O
        // ➍ (double)((lengthTop+lengthBottom) * height / 2) <- X


    }
}
