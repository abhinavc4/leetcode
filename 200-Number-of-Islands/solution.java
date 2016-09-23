public class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0)
        {
            return 0;
        }
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i = 0 ; i < grid.length;i++)
        {
            for(int j = 0 ; j < grid[0].length;j++)
            {
                if(!visited[i][j]&&grid[i][j]=='1')
                {
                    searchDFS(i,j,visited,grid);
                    ++count;
                }
            }
        }
        return count;
    }
    void searchDFS(int i , int j , boolean[][] visited , char[][]grid)
    {
        int[][] neighbours = new int[][]{{-1,0},{0,-1},{0,1},{1,0}};
        
        visited[i][j]=true;
        for(int k = 0 ; k<neighbours.length ; k++)
        {
            if(isSafe(i+neighbours[k][0],j+neighbours[k][1],visited,grid))
            {
                searchDFS(i+neighbours[k][0],j+neighbours[k][1],visited,grid);
            }
        }
    }
    boolean isSafe(int i , int j , boolean[][]visited,char[][]grid)
    {
        if(i>=0  &&
           i<grid.length &&
           j>=0 &&
           j< grid[0].length &&
           grid[i][j]=='1' &&
           visited[i][j]==false
           )
           {
               return true;
           }
           return false;
    }
}