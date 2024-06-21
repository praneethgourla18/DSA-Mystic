class Solution {
    public int diagonalSum(int[][] mat) {
       int sum=0;
       int row=mat.length;
       int col=mat.length;

       for(int i=0,j=0;i<row && j<col;i++,j++){
        sum+=mat[i][j];
       }
       for(int i=0,j=col-1;i<row && j>=0;i++,j--){
        if(i==j){
            continue;
        }
        sum+=mat[i][j];
       }
       return sum;
    }
}