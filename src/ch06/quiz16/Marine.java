package ch06.quiz16;

public class Marine {

    // 필드
    int x, y = 0;          // marine의 위치 좌표
    int hp = 60;           // marine의 체력
    static int weapon = 6; // marine의 공격력
    static int armor = 0;  // marine의 방어력

    // 메소드
    // 1. 공격력 증가시키는 메소드
    static void weaponUp() {
        weapon++;
    }

    // 2. 방어력 증가시키는 메소드
    static void armorUp() {
        armor++;
    }

    // 3. marine의 위치 움직이는 메소드
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
