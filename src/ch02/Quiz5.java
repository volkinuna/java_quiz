package ch02;

public class Quiz5 {
    public static void main(String[] args) {

        int intValue = 10;
        char charValue = 'A';
        double doubleValue = 5.7;
        String strValue = "A";

        double var1 = (double) intValue;
        byte var2 = (byte) intValue;
        int var3 = (int) doubleValue;
        // char var4 = (char) strValue; <- String은 객체(참조 타입)이고, char는 기본 타입이므로 형변환이 되지 않는다.

        // 객체 -> String
    }
}
