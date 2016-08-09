public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rowSize = board.length;
        int colSize = board[0].length;
        
        for(int i = 0 ; i < rowSize;i++)
        {
            if(!checkValid(board,i,i+1,0,colSize))
            {
                return false;
            }
        }
        
        for(int i = 0 ; i<colSize;i++)
        {
            if(!checkValid(board,0,rowSize,i,i+1))
            {
                return false;
            }
        }
        
        int r = (int)Math.sqrt(rowSize);
        int c = (int)Math.sqrt(colSize);
        for(int i = 0;i<rowSize;i=i+r)
        {
            for(int j = 0 ; j < colSize ;j=j+c)
            {
                if(!checkValid(board,i,i+r,j,j+c))
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean checkValid(char[][]board,int startRow , int endRow,int startCol,int endCol)
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = startRow;i<endRow;i++)
        {
            for(int j = startCol;j<endCol;j++)
            {
                char ch = board[i][j];
                if('.' != ch)
                {
                    if(false==hs.add(ch-'0'))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}