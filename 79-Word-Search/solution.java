public class Solution {
    public boolean exist(char[][] board, String word) {
        if(word.length() == 0)
        {
            return true;
        }
        for(int i = 0 ; i < board.length ; i++)
        {
            for(int j = 0 ; j < board[0].length ; j++)
            {
                if(exist(i,j,board,word,0))
                {
                    return true;
                }
            }
        }
        return false;
    }
    boolean exist(int i , int j ,char[][]board,String word,int index)
    {
        if(index==word.length())
        {
            return true;
        }
        if(i<0||j<0||i==board.length||j==board[0].length)
        {
            return false;
        }
        if(board[i][j] != word.charAt(index))
        {
            return false;
        }
        board[i][j]^=256;
        boolean val = exist(i+1,j,board,word,index+1)||
                      exist(i-1,j,board,word,index+1)||
                      exist(i,j+1,board,word,index+1)||
                      exist(i,j-1,board,word,index+1);
        board[i][j]^=256;
        return val;
    }
}