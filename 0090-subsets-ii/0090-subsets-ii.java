class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> output = new ArrayList<>(); 
       int index = 0;
       Arrays.sort(nums);
       getAllSubSequance(nums, index, output, ans);
      
       return ans;
    }

    
    public static void getAllSubSequance(int[] s, int index, List<Integer> output, List<List<Integer>> ans) {
        if(index >= s.length) {
           
            ans.add(new ArrayList<>(output)); 
            return;
        }
        int ch = s[index];
        output.add(ch);
        
        getAllSubSequance(s, index+1, output, ans);
        
        
        output.remove(output.size() - 1); 
        while (index + 1 < s.length && s[index] == s[index + 1]) {
            index++;
        }
        getAllSubSequance(s, index+1, output, ans);
    }
}