package ch07.quiz6;

public class Child extends Parent {

    public int studentNo;

    // 부모 생성자를 올바르게 호출하지 않았다.

    //    public Child(String name, int studentNo) {
    //        this.name = name;
    //        this.studentNo = studentNo;
    //    } 
    // 부모 클래스의 생성자에 매개변수가 있으면 super를 사용해야한다.
    // 위 코드의 오류는 아래 방법으로 해결
    public Child(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }
}
