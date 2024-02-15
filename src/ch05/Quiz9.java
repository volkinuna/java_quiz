package ch05;

public class Quiz9 {
    public static void main(String[] args) {
        //주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해보세요(힌트: 중첩 for 문 이용)
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
//
//        int total = 0;
//        int totalSum = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            total += array[i].length;
//            for (int j = 0; j < array[i].length; j++) {
//                totalSum += array[i][j];
//            }
//        }
//
//        double totalAvg = (double) totalSum / total;
//
//        System.out.println("전체 합계 : " + totalSum);
//        System.out.println("전체 평균 : " + totalAvg);

        int sum = 0;
        double avg = 0.0;
        int count = 0;

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j <array[i].length; j++) {
                sum += array[i][j]; // 배열 원소를 하나씩 가져와서 누적 합산
                count++; // 배열 원소의 갯수만큼 카운트
            }
        }

        avg = (double) sum /count;

        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);

    }
}
