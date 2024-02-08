package ch03;

public class Quiz3 {
    public static void main(String[] args) {

        int pencils = 534;
        int students = 30;
        int pencilsPerStudent = (pencils / students);
        System.out.println(pencilsPerStudent); //학생 한 명이 가지는 연필 수

        int pencilsLeft = (pencils - students * pencilsPerStudent);
        System.out.println(pencilsLeft); //남은 연필 수

    }
}
