class Solution {
    public int[][] transpose(int[][] matrix) {
        int arr[][] = new int[matrix[0].length][matrix.length];

        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0; j < matrix.length; j++){

                // if(j < arr[0].length){
                arr[i][j] = matrix[j][i];
                // }
            }
        }

        return arr;
    }
}