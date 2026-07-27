class Solution {
    public int[][] generateMatrix(int n) {
      
       int mat[][]=new int[n][n];
       int a=0;
       int b=0;
       int count=1;
       int c=n;
       int m=n;
       while(count<=n*n){
          
           for(int i=b; i<m; i++){
               mat[a][i] =count;
               count++;
               
           }
           a++;
           if(count>n*n) break;
           for(int i=a; i<c; i++){
                mat[i][m-1]=count;
                count++;
            
           }
           m--;
           if(count>n*n) break;
           for(int i=m-1;i>=b; i--){
               mat[c-1][i]=count; 
               count++;
           }
           c--;
           if(count>n*n) break;
           for(int i=c-1;i>=a; i--){
               mat[i][b]=count;
               count++;
           }
           b++;
           
           
           
       }
       return mat;
    }
}