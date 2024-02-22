package ch07.quiz10;

public class Computer extends Machine {

    // work( ) 추상 메소드를 재정의하지 않았기 때문이다.
    // 만약 재정의하지 않는다면 public abstract class Computer extends Machine { }과 같이 추상 클래스로 선언해야 한다.

    // Machine 클래스의 메소드에 abstract 메소드이기때문에 오버라이드 되어야한다.
    @Override
    public void work() {
        System.out.println("컴퓨터가 열심히 일을 합니다.");
    }
}
