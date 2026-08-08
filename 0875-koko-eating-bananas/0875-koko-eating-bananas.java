class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int ans = -1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(canEat(piles, mid, h)){
                ans = mid;         
                high = mid - 1;
            }
            else low = mid + 1;

        }
        return ans;
    }
    public static boolean canEat(int [] piles, int mid,int h){
         long totalHours = 0; 
        
        for (int pile : piles) {
           
            totalHours += Math.ceil((double) pile / mid);
        }
        
        return totalHours <= h;
    }
}