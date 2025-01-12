class Solution {
    public int solution(int n, int k) {
        int result = 0;
        
        result = (12000 * n) + ((k - (n / 10)) * 2000);
        
        return result;
    }
}