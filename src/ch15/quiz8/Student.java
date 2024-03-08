package ch15.quiz8;

public class Student {
    public int studentNum;
    public String name;
    public Student (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }
    //여기에 코드를 작성하세요.
    @Override
    public int hashCode() {
        return name.hashCode() + studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student target) {
            return target.name.equals(name) && (target.studentNum == studentNum);
        } else {
            return false;
        }
    }
}
