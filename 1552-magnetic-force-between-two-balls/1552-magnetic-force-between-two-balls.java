class Solution {
    public int maxDistance(int[] position, int m) {
      Arrays.sort(position);
      int n = position.length;
      int e = position[n - 1] - position[0];
      int s = 0;
      int ans = 0;
      while(e>=s){
          int mid = s + (e - s) / 2;
          if(isValid(mid, position, m)){
              ans = mid;
              s = mid + 1;
          }
          else{
            e = mid - 1;
          }
      } 
      return ans; 
    }
    static boolean isValid(int mid, int []arr, int m){
        int ball = 1;
        int lp = 0;
        for(int i = 1; i < arr.length; i++){
            if(mid <= arr[i] - arr[lp]){
                ball++;
                lp = i;
                if(ball == m) return true;
            }
            else{

            }
        }
        return false;
    }
}