package ch12.quiz7;

public class IntergerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2);
        System.out.println(obj3 == obj4);
        // ==은 주소 비교, equals()은 실제 값 비교이나 예외가 있다. -128 ~ 127 사이의 숫자는 값 자체를 비교한다.
        System.out.println(obj3.equals(obj4));
    }
}
