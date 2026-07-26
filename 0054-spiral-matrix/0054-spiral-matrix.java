class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       ArrayList<Integer> arr= new ArrayList<>();
       int n=matrix.length;
       int m = matrix[0].length;
       int a=0;
       int b=0;
       int c=matrix.length;
       int d=matrix[0].length;
       while(arr.size()<d*c){
          
           for(int i=b; i<m; i++){
               arr.add(matrix[a][i]);
               
           }
           a++;
           if(arr.size()==d*c) break;
           for(int i=a; i<n; i++){
                arr.add(matrix[i][m-1]);
            
           }
           m--;
           if(arr.size()==d*c) break;
           for(int i=m-1;i>=b; i--){
              arr.add(matrix[n-1][i]); 
             
           }
           n--;
           if(arr.size()==d*c) break;
           for(int i=n-1;i>=a; i--){
              arr.add(matrix[i][b]); 
             
           }
           b++;
           
           
           
       }
       return arr;
    }
}