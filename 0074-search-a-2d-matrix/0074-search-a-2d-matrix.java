class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;

        int n=matrix[0].length;
        int m =matrix.length;
        int j=n-1;
        while(i<m){
            if (matrix[i][j]==target) return true;
            else if(matrix[i][j]<target) i++;
            else{
                if(j>0) j--;
                else return false;
               
            }
        }
        return false;
    }
}