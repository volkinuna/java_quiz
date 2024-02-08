package ch03;

public class Quiz11 {
    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;
        //byte c = a + b;
        byte c = (byte) (a + b); // byte끼리 연산시에 int형이 되므로 강제타입변환

        char ch = 'A';
        //ch = ch + 2;
        ch = (char) (ch + 2);

        //float f = 3 / 2; // 정수 연산의 결과는 정수로 1.0이 나온다.
        float f = 3 / 2.0f;
        //long l = 3000 * 3000 * 3000;
        long l = (long) 3000 * 3000 * 3000;
        // long l = 3000 * 3000 * 3000L; // 허용범위가 큰 타입으로 연산된다.
        float f2 = 0.1f;

        double d = 0.1;
        //boolean result = d == f2;
        //boolean result = d != f2;
        boolean result = (float) d == f2; // 비교 연산시 반드시 실수 타입을 맞춰야한다.
        // double과 float는 비교할때 반드시 타입을 같이 맞춰줘야 한다.(부동소수점 때문에)

        System.out.println("c=" + c);
        System.out.println("ch=" + ch);
        System.out.println("f=" + f);
        System.out.println("l=" + l);
        System.out.println("result=" + result);

    }
}
