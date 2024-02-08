package ch03;

public class Quiz2 {
    public static void main(String[] args) {

        int score = 85;
        String result = (!(score > 90)) ? "가" : "나"; // (85>90)의 부정
        System.out.println(result); // 가

    }
}
