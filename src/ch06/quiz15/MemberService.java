package ch06.quiz15;

public class MemberService {
    /*
    ➊ login ( ) 메소드는 매개값 id가 "hong", 매개값 password가 "12345" 일 경우에만 true로 리턴
    ➋ logout ( ) 메소드는 id + "님이 로그아웃 되었습니다"가 출력되도록 할 것
    */


    String id;
    String password;

    boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        } else {
            return false;
        }
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
