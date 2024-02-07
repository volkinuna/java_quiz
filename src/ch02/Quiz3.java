package ch02;

public class Quiz3 {
    public static void main(String[] args) {

        System.out.println("1" + "2"); // 문자열 연산
        System.out.println('A' + 'B'); // char형 + char형 = int형으로 자동타입변환이 일어난다.
        System.out.println('1' + 2); // char형 + int형 = int형으로 자동타입변환이 일어난다.
        System.out.println('1' + '2'); // char형 + char형 = int형으로 자동타입변환이 일어난다.
        System.out.println('J' + "ava"); // String형 + 다른타입 = 항상 문자열
    }
}
