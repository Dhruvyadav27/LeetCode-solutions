class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> output = new ArrayList<>(); 
       int index = 0;
       
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
        getAllSubSequance(s, index+1, output, ans); 
    }
}