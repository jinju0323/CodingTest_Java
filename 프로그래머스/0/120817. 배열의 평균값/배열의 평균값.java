class Solution {
    public double solution(int[] numbers) {
        double result = 0; // 누적합산할 변수를 0으로 초기화
        
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i]; // i번째 원소를 누적합산
        }
        return result / numbers.length; // 배열의 길이만큼 나누어 평균 계산
    }
}
