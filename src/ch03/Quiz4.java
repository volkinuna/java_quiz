package ch03;

public class Quiz4 {
    public static void main(String[] args) {

        //십의 자리 이하를 버리는 코드입니다.
        //변수 value의 값이 356이라면 300이 나올 수 있도록 ( )에 알맞은 코드를 작성하세요(산술 연산자만 사용).
        int value = 356;
        System.out.println((value / 100) * 100);
    }
}
