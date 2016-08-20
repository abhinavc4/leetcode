public class Solution {
    public int minPathSum(int[][] grid) {
        int rowSize = grid.length-1;
        int colSize = grid[0].length-1;
        for(int i = 0 ; i <= rowSize ; i++)
        {
            for(int j = 0 ; j<= colSize ; j++)
            {
                if(i==0&&j==0)
                {
                    grid[i][j]=grid[i][j];
                }
                else if(i != 0 && j == 0)
                {
                    grid[i][j] = grid[i][j] + grid[i-1][j];
                }
                else if(i==0 && j != 0)
                {
                    grid[i][j] = grid[i][j] + grid[i][j-1];
                }
                else 
                {
                    grid[i][j] = Math.min(grid[i-1][j],grid[i][j-1]) + grid[i][j];
                }
            }
        }
        return grid[rowSize][colSize];
    }
}