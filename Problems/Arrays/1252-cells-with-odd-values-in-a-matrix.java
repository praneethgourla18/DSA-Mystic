class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int temp[][] = new int[m][n];
        for(int  i = 0; i<indices.length ; i++){

            int rowidx = indices[i][0];
            int colidx = indices[i][1];

            for(int j = 0 ; j<n ; j++ ){
                temp[rowidx][j] += 1;

            }

            for(int k = 0 ; k<m ; k++){
                temp[k][colidx] += 1; 
            }

            }

            int count  = 0;

            for(int i = 0 ; i <m ; i++){
                for(int j = 0 ; j<n ; j++){
                    if(temp[i][j] % 2 != 0){
                        count++;
                    }
                } 
            }

            return count;
        }
    }