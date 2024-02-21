package ch06.quiz23;

public class Account {
    /*
    다음은 키보드로부터 계좌 정보를 입력받아 계좌를 관리하는 프로그램입니다. 계좌는Account
    객체로 생성되고 BankApplication에서 길이 100인 Account[ ] 배열로 관리됩니다. 실행 결과를
    보고, Account와 BankApplication 클래스를 작성해보세요(키보드로 입력받을 때는 Scanner
    의 nextLine ( ) 메소드를 사용).
    */

    private String ano;   // 계좌번호
    private String owner; // 계좌주
    private int balence;  // 잔고

    public Account(String ano, String owner, int balence) {
        this.ano = ano;
        this.owner = owner;
        this.balence = balence;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalence() {
        return balence;
    }

    public void setBalence(int balence) {
        this.balence = balence;
    }

}
