class Solution {
    public boolean isPowerOfFour(int n) {
        long pow = 1;
        if(n == 1) return true;
        if(n < 4) return false;

        return solve(n, pow);

    }
    public static boolean solve(int n, long pow){
        if(pow == n){
            return true;
        }
        else if(pow > n) return false;

        return solve(n, pow * 4);
        
    }
}