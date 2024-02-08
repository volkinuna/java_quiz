package ch03;

public class Quiz1 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = (++x) + (y--); // 11 + 20 = z, y = 19
        System.out.println(z); // 31

    }
}
