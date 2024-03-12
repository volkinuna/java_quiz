package ch15.quiz8;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    //여기에 코드를 작성하세요.
    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (student.studentNum == studentNum) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
