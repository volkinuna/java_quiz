package ch06.quiz20;

public class Example {
    /*
    -메서드명 : isNumber
    -기능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
           모두 숫자로만 이루어져 있으면 true를 반환하고, 그렇지 않으면 false를 반환한다.
           만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다.
    -반환타입 : boolean
    -매개변수 : String str ->검사할 문자열
    */
    //isNumber() 메소드 작성
    static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        //        for (int i = 0; i < str.length(); i++) {
        //            if (!Character.isDigit(str.charAt(i))) {
        //                return false;
        //            }
        //        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // 자동타입변환이 일어나면서 유니코드로 비교한다.
            // 유니코드는 0~9사이의 숫자만 존재한다.
            if (ch < '0' || ch > '9') return false; // 메소드 종료
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
