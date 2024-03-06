package ch12;

import java.util.StringTokenizer;

public class Quiz6 {
    public static void main(String[] args) {
        //다음 문자열에서 쉼표(,)로 구분되어 있는 문자열을 StringTokenizer를 이용해서 분리시키고 출력해보세요.

        String data = "아이디, 이름, 패스워드";

        StringTokenizer st = new StringTokenizer(data, ", ");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
