class Solution {
    public void rotate(int[] nums, int k) {
        int a=nums.length;
        if(k>a){
            k=k%a;
        }
        if(k==0) return;
        reverse(nums,0,a-1);
        reverse(nums,0,k-1);
        reverse(nums,k,a-1);
    }
    void reverse(int []arr,int i, int j){
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
}