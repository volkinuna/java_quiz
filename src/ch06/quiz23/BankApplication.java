package ch06.quiz23;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        /*
        다음은 키보드로부터 계좌 정보를 입력받아 계좌를 관리하는 프로그램입니다. 계좌는Account
        객체로 생성되고 BankApplication에서 길이 100인 Account[ ] 배열로 관리됩니다. 실행 결과를
        보고, Account와 BankApplication 클래스를 작성해보세요(키보드로 입력받을 때는 Scanner
        의 nextLine ( ) 메소드를 사용).
        */

        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        while (account.run) {
            System.out.println("---------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------");
            System.out.print("선택> ");

            int menuNum = scanner.nextInt();

            switch (menuNum) {
                case 1:
                    account.acc();
                    break;
                case 2:
                    account.accList();
                    break;
                case 3:
                    account.plus();
                    break;
                case 4:
                    account.minus();
                    break;
                case 5:
                    account.run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
