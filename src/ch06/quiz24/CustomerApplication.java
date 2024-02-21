package ch06.quiz24;

import java.util.Scanner;

public class CustomerApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static Customer[] customerArray = new Customer[50];

    public static void main(String[] args) {

        boolean run = true;

        while (run) {
            System.out.println("-------------------------------------------------------");
            System.out.println("1.고객등록 | 2.고객확인 | 3.포인트사용 | 4.포인트적립 | 5.종료");
            System.out.println("-------------------------------------------------------");

            System.out.print("선택> ");
            int selectNo = scanner.nextInt();

            switch (selectNo) {
                case 1:
                    clientAdd();
                    break;
                case 2:
                    clientList();
                    break;
                case 3:
                    pointUse();
                    break;
                case 4:
                    pointSave();
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void clientAdd() {
        System.out.println("--------");
        System.out.println("고객등록");
        System.out.println("--------");

        System.out.print("고객명 : ");
        String client = scanner.next();
        System.out.print("핸드폰 번호 : ");
        String phone = scanner.next();
        System.out.print("집 주소 : ");
        String address = scanner.next();
        System.out.print("포인트 : ");
        int point = scanner.nextInt();

        Customer newCustomer = new Customer(client, phone, address, point);

        for (int i = 0; i < customerArray.length; i++) {

            if (customerArray[i] == null) {
                customerArray[i] = newCustomer;
                System.out.println("정상적으로 고객 등록이 되었습니다.");
                break;
            }
        }
    }

    private static void clientList() {
        System.out.println("--------");
        System.out.println("고객확인");
        System.out.println("--------");

        for (int i = 0; i < customerArray.length; i++) {
            Customer customer = customerArray[i];

            if (customer != null) {
                System.out.println("고객명 : " + customer.getClient() + " | 핸드폰 번호 : " + customer.getPhone() + " | 포인트 : " + customer.getTotalPoint());
            } else {
                break;
            }
        }
    }

    private static void pointUse() {
        System.out.println("--------");
        System.out.println("포인트사용");
        System.out.println("--------");

        System.out.print("핸드폰 번호 : ");
        String phone = scanner.next();
        System.out.print("사용할 포인트 : ");
        int point = scanner.nextInt();

        Customer customer = findCustomer(phone);

        if (customer == null) {
            System.out.println("등록된 고객이 아닙니다.");
            return;
        } else if (customer.getTotalPoint() < 500) {
            System.out.println("전체 포인트가 500점 이상일 경우만 사용 가능합니다.");
            System.out.println("현재 " + customer.getTotalPoint() + " 포인트입니다.");
            return;
        } else {
            customer.setTotalPoint(customer.getTotalPoint() - point);
            System.out.println(point + " 포인트가 사용되었습니다.");
        }
    }

    private static void pointSave() {
        System.out.println("--------");
        System.out.println("포인트적립");
        System.out.println("--------");

        System.out.print("핸드폰 번호 : ");
        String phone = scanner.next();
        System.out.print("적립할 포인트 : ");
        int point = scanner.nextInt();

        Customer customer = findCustomer(phone);

        if (customer == null) {
            System.out.println("등록된 고객이 아닙니다.");
            return;
        } else if (point >= 2000) {
            int addPoint = (int)(point * 0.1);
            customer.setTotalPoint(customer.getTotalPoint() + point + addPoint);
            System.out.println(point + " 포인트가 적립되었습니다.");
            System.out.println("적립한 포인트의 10%인 " + addPoint + " 포인트가 추가 적립되었습니다.");
        } else {
            customer.setTotalPoint(customer.getTotalPoint() + point);
            System.out.println(point + " 포인트가 적립되었습니다.");
        }
    }

    private static Customer findCustomer(String phone) {
        Customer customer = null;

        for (int i = 0; i < customerArray.length; i++) {

            if (customerArray[i] != null) {
                String dbPhone = customerArray[i].getPhone();

                if (dbPhone.equals(phone)) {
                    customer = customerArray[i];
                    break;
                }
            }
        }
        return customer;
    }
}
