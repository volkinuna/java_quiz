package ch04;

public class Quiz8 {
    public static void main(String[] args) {

        System.out.println("==== 내 답 ====");
        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("=== 선생님 답 ===");
        for (int i = 1; i <= 5; i++) { // 행의 갯수와 일치
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j == i) System.out.println(); // 줄바꿈을 위해..
            }
        }

    }
}
