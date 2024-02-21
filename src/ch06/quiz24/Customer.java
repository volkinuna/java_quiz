package ch06.quiz24;

public class Customer {
    private String client;  // 고객명
    private String phone;   // 핸드폰 번호
    private String address; // 집 주소
    private int totalPoint; // 포인트

    public Customer(String client, String phone, String address, int totalPoint) {
        this.client = client;
        this.phone = phone;
        this.address = address;
        this.totalPoint = totalPoint;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(int totalPoint) {
        this.totalPoint = totalPoint;
    }
}
