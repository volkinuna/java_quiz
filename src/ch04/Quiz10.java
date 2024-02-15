package ch04;

import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        boolean bank = true;
        int save = 0;
        int pay = 0;
        int money = 0;

        while (bank) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");

            System.out.print("선택> ");
            String strNum = scanner.nextLine();

            if (strNum.equals("1")) {
                System.out.print("예금액 > ");
                String saving = scanner.nextLine();
                save = Integer.parseInt(saving);
            } else if (strNum.equals("2")) {
                System.out.print("출금액 > ");
                String paying = scanner.nextLine();
                pay = Integer.parseInt(paying);
            } else if (strNum.equals("3")) {
                money = save - pay;
                System.out.println("잔고 > " + money);
            } else {
                bank = false;
            }
        }

        System.out.println("프로그램 종료");
        */

        boolean run = true; // 실행상태 <- 플래그 변수
        int balance = 0;    // 통장 잔고

        while (run) {
            System.out.println("--------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("--------------------------------");
            System.out.print("선택> ");

            int menuNum = scanner.nextInt(); // int타입으로 받는다.

            switch (menuNum) {
                case 1:
                    System.out.print("예금액 > ");
                    balance += scanner.nextInt(); // 통장 잔고에 기존에 예금했던 돈을 유지하기 위해 누적 합산
                    break;
                case 2:
                    System.out.print("출금액 > ");
                    balance -= scanner.nextInt();
                    break;
                case 3:
                    System.out.print("잔고 >  ");
                    System.out.println(balance);
                    break;
                case 4:
                    run = false;
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");

    }
}
