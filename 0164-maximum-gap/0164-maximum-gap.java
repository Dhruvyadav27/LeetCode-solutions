class Solution {
    public int maximumGap(int[] nums) {
        int k=0;
        Arrays.sort(nums);
        int max=0;
        int diff=0;
        for(int i=0;i<nums.length-1;i++){
            diff=nums[i+1]-nums[i];
            if(diff>max){
                max=diff;
            }
        }
        return max;
    }
}