import java.math.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2; // 분모
        int numer = denom2 * numer1 + denom1 * numer2; // 분자
        
        int gcd = gcd(numer, denom); // 기약분수
        
        int[] result = {numer / gcd, denom / gcd};
        
        return result;
    }
    
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}