package ch04;

public class Quiz4 {
    public static void main(String[] args) {

        //while 문과 Math.random( ) 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는
        //값을 (값1, 값2) 형태로 출력하고, 값의 합이 5가 아니면 계속 주사위를 던지고,
        //값의 합이 5이면 실행을 멈추는 코드를 작성해보세요. 값의 합이 5가 되는 경우는 (1, 4), (4, 1), (2, 3), (3, 2)입니다.

        while(true){
            int num1 = (int) (Math.random() * 6) + 1; //1~6까지의 숫자를 랜덤하게 구해줍니다.
            int num2 = (int) (Math.random() * 6) + 1; //1~6까지의 숫자를 랜덤하게 구해줍니다.

            System.out.println("(" + num1 + ", " + num2 + ")");

            if (num1 + num2 == 5) break;
        }

    }
}
