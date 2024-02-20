package ch06.quiz18;

public class Example {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;
    //static int cv2 = iv; // 첫번째 컴파일 에러
    // static변수의 초기화에 인스턴스 변수를 사용할 수 없다.
    // 꼭 사용해야한다면, 객체를 생성해야한다.

    static void staticMethod1() {
        System.out.println(cv);
        //System.out.println(iv); // 두번째 컴파일 에러
        // static 메서드에서는 인스턴스 변수를 사용할 수 없다
        // 인스턴스 필드를 사용하기 위해선 객체 생성이 되어야한다.
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
        //instanceMethod1(); // 세번째 컴파일 에러
        // static 메서드에서는 인스턴스 메서드를 사용할 수 없다.
        // 인스턴스 메소드를 사용하기 위해선 객체 생성이 되어야한다.
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }

}
