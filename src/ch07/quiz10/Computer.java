package ch07.quiz10;

public class Computer extends Machine {

    // Machine 클래스의 메소드에 abstract 메소드이기때문에 오버라이드 되어야한다.
    @Override
    public void work() {
        System.out.println("컴퓨터가 열심히 일을 합니다.");
    }
}
