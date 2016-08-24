public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(matrix.length==0)
        {
            return false;
        }
        int i = 0 ; int j = cols-1;
        
        while(j>=0 && i<rows && matrix[i][j] != target)
        {
            if(matrix[i][j]==target)
            {
                return true;
            }
            while(j>=0 && matrix[i][j]>target)
            {
                j--;
            }
            
            while(j>=0 && i<rows && matrix[i][j] <target)
            {
                i++;
            }
        }
        if(j >= 0 && i < rows && matrix[i][j] == target)
        {
            return true;
        }
        return false;
    }
    
    
}