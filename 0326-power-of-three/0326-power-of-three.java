class Solution {
    public boolean isPowerOfThree(int n) {
      return powerOfThree(n);  
    }
    public static boolean powerOfThree(int n){
        if(n == 1) return true;
        else if(n < 3) return false;
        else if(n % 3 == 0) {
               return powerOfThree(n/3);
        }
        else return false;
    }
}