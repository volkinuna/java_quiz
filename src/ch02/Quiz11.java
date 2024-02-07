package ch02;

public class Quiz11 {
    public static void main(String[] args) {

        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        b = (byte) i;
        ch = (char) b; // char형이 byte형보다 허용범위는 크지만, 음수부호를 가지는 byte는 음수를 사용하지 않는 char형으로 자동타입변환 할 수 없다.
        short s = (short) ch; // char형과 short형은 허용범위는 같지만, char형이 가용범위가 더 크므로 자동타입변환 할 수 없다.
        i = (int) ch; // (int) 생략가능 <- char형은 int보다 허용범위가 작으므로 자동타입변환 발생

    }
}
