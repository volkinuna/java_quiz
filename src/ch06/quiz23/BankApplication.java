package ch06.quiz23;

import java.util.Scanner;

public class BankApplication {
    // private : BankApplication 클래스 안에서만 사용 가능
    // static : static main 메소스 안에서 사용 가능
    private static Scanner scanner = new Scanner(System.in);
    private static Account[] accountArray = new Account[100]; // Account 객체만 저장가능

    public static void main(String[] args) {
        /*
        다음은 키보드로부터 계좌 정보를 입력받아 계좌를 관리하는 프로그램입니다. 계좌는Account
        객체로 생성되고 BankApplication에서 길이 100인 Account[ ] 배열로 관리됩니다. 실행 결과를
        보고, Account와 BankApplication 클래스를 작성해보세요(키보드로 입력받을 때는 Scanner
        의 nextLine ( ) 메소드를 사용).
        */

        boolean run = true;

        while (run) {
            System.out.println("---------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------");

            System.out.print("선택> ");
            int selectNo = scanner.nextInt();

            switch (selectNo) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdrew();
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }

    // static : static이 붙은 main 메소드 안에서 호출하기 위해 붙여줌
    // 1. 계좌 생성
    private static void createAccount() {
        System.out.println("--------");
        System.out.println("계좌생성");
        System.out.println("--------");

        System.out.print("계좌번호 : ");
        String ano = scanner.next();
        System.out.print("계좌주 : ");
        String owner = scanner.next();
        System.out.print("초기입금액 : ");
        int balance = scanner.nextInt();

        // 입력받은 정보를 이용해 Account 객체 생성
        Account newAccount = new Account(ano, owner, balance);

        // accountArray 배열에 Account 객체를 저장하기
        for (int i = 0; i < accountArray.length; i++) {
            // accountArray의 디폴트 값은 null이 들어있다.
            // ★계좌 객체를 순서대로 저장하기 위헤 null 체크
            if (accountArray[i] == null) { // ★null에 순서대로 계좌 객체가 채워지기 때문에 필수로 체크해야한다.
                accountArray[i] = newAccount;
                System.out.println("결과 : 계좌가 생성되었습니다.");
                // ★쓸데없는 반복은 피한다. newAccount 객체를 배열에 전부 저장하지 않는다.
                break; // break를 걸지 않으면 accountArray 배열에 100개의 객체가 있는데 다 돔
            }
        }
    }

    // 2. 계좌 목록 보여줌
    private static void accountList() {
        System.out.println("--------");
        System.out.println("계좌목록");
        System.out.println("--------");

        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];

            // ★accountArray 배열 안에서 Account 객체가 있는 부분만 가져온다.
            if (account != null) {
                System.out.println("계좌번호 : " + account.getAno() + " | 계좌주 : " + account.getOwner() + " | 잔고 : " + account.getBalence());
            } else {
                break; // ★쓸데없는 반복 피하기
            }
        }
    }

    // 3. 예금
    private static void deposit() {
        System.out.println("--------");
        System.out.println("예금");
        System.out.println("--------");

        System.out.print("계좌번호 : ");
        String ano = scanner.next();
        System.out.print("예금액 : ");
        int money = scanner.nextInt();

        // 입력받은 계좌번호로 고객계좌 객체 찾기
        Account account = findAccount(ano); // 찾은 고객계좌

        // 해당 고객계좌가 없으면 메소드를 종료시킴
        if (account == null) {
            System.out.println("결과 : 계좌가 없습니다.");
            return;
        }

        // 기존에 저장되어 있던 예금액 + 새로 입금할 예금액
        account.setBalence(account.getBalence() + money);
        System.out.println("결과 : 예금이 완료되었습니다.");
    }

    // 4. 출금
    private static void withdrew() {
        System.out.println("--------");
        System.out.println("출금");
        System.out.println("--------");

        System.out.print("계좌번호 : ");
        String ano = scanner.next();
        System.out.print("출금액 : ");
        int money = scanner.nextInt();

        // 입력받은 계좌번호로 고객계좌 객체 찾기
        Account account = findAccount(ano); // 찾은 고객계좌

        // 해당 고객계좌가 없으면 메소드를 종료시킴
        if (account == null) {
            System.out.println("결과 : 계좌가 없습니다.");
            return;
        }

        // '기존에 저장되어 있던 출금액 - 새로 입금할 출금액'을 빼서 잔고에 추가해준다.
        account.setBalence(account.getBalence() - money);
        System.out.println("결과 : 출금이 완료되었습니다.");
    }

    // 5. 계좌번호로 고객 계좌 찾기(Account 객체를 리턴해준다.)
    private static Account findAccount(String ano) {
        Account account = null;
        // for문 안에 있으면 account 값이 계속 바뀌기 때문에 밖으로 빼야한다. 또, return도 해줘야하기 때문에 for문 바깥에 변수 선언

        // 배열에 저장된 객체별 계좌번호를 하나씩 비교해 고객계좌를 찾는다.
        for (int i = 0; i < accountArray.length; i++) {

            // ★accountArray 배열 안에서 Account 객체가 있는 부분만 가져온다.
            if (accountArray[i] != null) {
                // 객체에 저장된 계좌번호 가져오기
                String dbAno = accountArray[i].getAno();

                // 객체에 저장된 계좌번호와 매개변수의 계좌번호가 같으면 해당 객체를 account 변수에 저장
                if (dbAno.equals(ano)) {
                    account = accountArray[i];
                    break; // 계좌번호를 찾으면 반복문을 빠져 나온다.
                }
            }
        }
        return account; // 찾는 해당 계좌 객체를 리턴
    }
}
