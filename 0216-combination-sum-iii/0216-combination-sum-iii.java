class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> output = new ArrayList();

        int num = 1;
        int index =0;
        int sum = 0;

        solve(k, n, num, index, sum, output, ans);
        return ans;
    }
    public static void solve(int k, int n, int num, int index, int sum, List<Integer> output, List<List<Integer>> ans){
        if(num > 10 || index > k || sum > n) return;
        if(sum == n){
            if(output.size() == k){
                ans.add(new ArrayList(output));
                return;
            }
            else return;
        }

        if(num > 9) return;

        
        output.add(num);
        

        solve(k, n, num +1, index+1, sum + num , output, ans);
        
        
        output.remove(output.size() - 1);
        solve(k, n, num+1, index, sum, output, ans);


    }
}