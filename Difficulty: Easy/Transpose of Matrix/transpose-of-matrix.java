class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int n=mat.length;
        for(int i=0; i<n;i++){
            for(int j=i; j<n;j++){
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0; i<n;i++){
            ans.add(new ArrayList<>());
            for(int j=0; j<n;j++){
                ans.get(i).add(mat[i][j]);
            }
        }
        return ans;
    }
}