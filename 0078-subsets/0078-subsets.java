class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;
        solve(nums, output, ans, index );

        return ans;


    }
    public static void solve(int[] nums, List<Integer> output, List<List<Integer>> ans, int index){

        if(index >= nums.length){
            ans.add(new ArrayList<>(output));
            return;

        }

        int currentValue = nums[index];
        output.add(currentValue);
        
        solve(nums, output, ans, index+1);

        output.remove(output.size() - 1);
        solve(nums, output, ans, index+1);
    }
}