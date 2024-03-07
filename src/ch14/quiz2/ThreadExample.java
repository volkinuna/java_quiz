package ch14.quiz2;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <5 ; i++) {
                    System.out.println("글 작성 중");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread1.start();

        for (int i = 0; i < 5 ; i++) {
            System.out.println("음악 듣는중");
        }

        // 멀티스레드로 실행

    }
}
