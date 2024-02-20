package ch06.quiz23;

import java.util.Scanner;

public class Account {
    /*
    다음은 키보드로부터 계좌 정보를 입력받아 계좌를 관리하는 프로그램입니다. 계좌는Account
    객체로 생성되고 BankApplication에서 길이 100인 Account[ ] 배열로 관리됩니다. 실행 결과를
    보고, Account와 BankApplication 클래스를 작성해보세요(키보드로 입력받을 때는 Scanner
    의 nextLine ( ) 메소드를 사용).
    */

    Scanner scanner = new Scanner(System.in);

    String accNum[];
    String accName[];
    int balence;
    boolean run = true;

    void acc() {
        System.out.println("--------");
        System.out.println("계좌생성");
        System.out.println("--------");
        System.out.print("계좌번호 : ");
        //this.accNum[] = scanner.nextLine();
        System.out.print("계좌주 : ");
        String accName = scanner.nextLine();
        System.out.print("초기입금액 : ");
        int balence = scanner.nextInt();
        System.out.println("결과 : 계좌가 생성되었습니다.");
    }

    void accList() {
        System.out.println("--------");
        System.out.println("계좌목록");
        System.out.println("--------");
    }

    void plus() {
        System.out.println("--------");
        System.out.println("예금");
        System.out.println("--------");
        System.out.print("계좌번호 : ");
        System.out.print("예금액 : ");
    }

    void minus() {
        System.out.println("--------");
        System.out.println("출금");
        System.out.println("--------");
        System.out.print("계좌번호 : ");
        System.out.print("출금액 : ");
        System.out.print("결과 : 출금이 성공되었습니다.");
    }
}
