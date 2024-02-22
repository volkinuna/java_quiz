package ch07.quiz7;

public class Child extends Parent {

    public String name;

    // 1. 부모 생성자를 먼저 실행하므로 Parent() 생성자를 먼저 실행한다.
    public Child() {
        // 5. this("홍길동");로 인해 Child(String name) 생성자 호출
        this("홍길동");
        // 7. Child(String name) 생성자 처리 후 출력
        System.out.println("Child() call");
    }

    // 6. 호출된 sout을 출력
    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call");
    }

}