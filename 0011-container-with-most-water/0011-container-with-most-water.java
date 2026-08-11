class Solution {
    public int maxArea(int[] height) {
      int area=0;
      int maxarea=0;
      int i=0;
      int j=height.length-1;

      for(int k=0;k<height.length; k++){
        if(height[i]<height[j]){
            area=height[i]*(j-i);
            i++;
        }
        else{
            area=height[j]*(j-i);
            j--;
        }
        if(area>maxarea) maxarea=area;
      }
      return maxarea;
    }
}