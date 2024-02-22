package ch07.quiz7;

public class Parent {
    public String nation;

    public Parent() {
        // 2. this("대한민국");로 인해 Parent(String nation) 생성자 호출
        this("대한민국");
        
        // 4. Parent(String nation) 생성자 처리 후 출력
        System.out.println("Parent() call");
    }

    // 3. 호출된 sout을 출력 
    public Parent(String nation) {
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }
}
