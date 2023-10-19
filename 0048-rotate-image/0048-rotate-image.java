class Solution {
    public void rotate(int[][] matrix) {
        int arr[][] = new int[matrix.length][matrix[0].length];

        int row = 0;
        for(int i = 0; i < matrix[0].length; i++){
            int col = 0;
            for(int j = matrix.length - 1; j >= 0; j--){
                arr[row][col] = matrix[j][i];
                col += 1;
            }
            row += 1;
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                matrix[i][j] = arr[i][j];
            }
        }


    }
}