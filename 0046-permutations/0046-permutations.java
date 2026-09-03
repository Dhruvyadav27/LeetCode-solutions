class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans =new ArrayList();
       List<Integer> output =new ArrayList();
      
       solve(nums, output, ans);

       return ans;
    }

    public static void solve(int[] nums, List<Integer> output, List<List<Integer>> ans) {
       if(nums.length == output.size()){
           ans.add(new ArrayList(output));
         
           return;
           
       }

       for (int i = 0; i < nums.length; i ++){
           int n = nums[i];
           if (output.contains(n)) {
                continue;
            }
           output.add(n);
           
           solve(nums, output, ans);
           output.remove(output.size() - 1);
       }
    }
}