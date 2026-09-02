class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> output = new ArrayList();
        int index = 0;

        solve(candidates, target, index, ans, output);
        return ans;
    }
    public static void solve(int[] candidates, int target, int index, List<List<Integer>> ans, List<Integer> output){

        if(target == 0){
            ans.add(new ArrayList(output));
            return;
        }

        if(target < 0){
            return;
        }
        if(index >= candidates.length) return;

        int currValue = candidates[index];
        output.add(currValue);

        solve(candidates, target - currValue, index, ans, output);

        output.remove(output.size() -1);
        solve(candidates, target , index + 1, ans, output);
    }
}