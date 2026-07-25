class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int i=0, j=0;

        while(i<=n-1){
            ans.add(new ArrayList<>());
            while(j<=i){
                if(j==0){
                    ans.get(i).add(1);
                }
                else if(j==i){
                    ans.get(i).add(1);
                }
                else{
                    ans.get(i).add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
                }
                j++;
            }
            j=0;
            i++;
        }
        
        return ans.get(n-1);
        
    }
}