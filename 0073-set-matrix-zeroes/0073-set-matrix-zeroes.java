class Solution {
    public void setZeroes(int[][] matrix) {
        
        int firstRow_and_firstColoumn = matrix[0][0];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){

                    if(j == 0){
                        firstRow_and_firstColoumn = 0;
                        continue;
                    }

                    // Make the first column zero
                    matrix[0][j] = 0;

                    // Make the first row zero
                    matrix[i][0] = 0;
                }
            }
        }


        for(int i = matrix.length - 1; i > 0; i--){
            for(int j = matrix[0].length - 1; j > 0; j--){

                if(matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }

                if(matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }

            }
        }


        if(matrix[0][0] == 0){
            for(int i = 0; i < matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }

        if(firstRow_and_firstColoumn == 0){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }
}