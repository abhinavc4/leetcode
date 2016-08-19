public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        while(row <= matrix.length-1 && col >= 0)
        {
            if(matrix[row][col]==target)
            {
                return true;
            }
            while(row<=matrix.length-1 && matrix[row][col]<target)
            {
                row++;
            }
            while(col>=0 && row<=matrix.length-1 && matrix[row][col]>target)
            {
                col--;
            }
        }
        return false;
    }
}