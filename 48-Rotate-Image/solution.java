public class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length/2;i++)
        {
            for(int j = i ;j<matrix.length-i-1;j++ )
            {
                int temp1 = matrix[i][j];
                int temp2 = matrix[j][matrix.length-i-1];
                int temp3 = matrix[matrix.length-i-1][matrix.length-j-1];
                int temp4 = matrix[matrix.length-j-1][i];

                matrix[i][j] = temp4;
                matrix[j][matrix.length-i-1] = temp1;
                matrix[matrix.length-i-1][matrix.length-j-1] = temp2;
                matrix[matrix.length-j-1][i] = temp3; 

            }
        }
    }
}