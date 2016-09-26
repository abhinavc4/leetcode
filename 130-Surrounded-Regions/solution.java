public class Solution {
    public void solve(char[][] board) {
        if(board==null||board.length==0||board[0].length==0)
        {
            return ;
        }
        int m = board.length;
        int n = board[0].length;
        
        for(int i = 0 ; i < m ; i++)
        {
            if(board[i][0]=='O')
            {
                bfs(board,i,0);
            }
            if(board[i][n-1]=='O')
            {
                bfs(board,i,n-1);
            }
        }
        for(int j = 0 ; j < n ; j++)
        {
            if(board[0][j] =='O')
            {
                bfs(board,0,j);
            }
            if(board[m-1][j]=='O')
            {
                bfs(board,m-1,j);
            }
        }
        
        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(board[i][j]=='O')
                {
                    board[i][j] = 'X';
                }
                if(board[i][j]=='1')
                {
                    board[i][j] ='O';
                }
            }
        }
    }
    
    void bfs(char[][]board,int i , int j)
    {
        int m = board.length;
        int n = board[0].length;
        
        int index = i*n+j;
        
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(index);
        board[i][j]='1';
        while(!q.isEmpty())
        {
            Integer val = q.remove();
            int i1 = val/n;
            int i2 = val%n;
            
            if(i1-1>=0 && board[i1-1][i2]=='O')
            {
                board[i1-1][i2] = '1';
                q.add((i1-1)*n+i2);
            }
            
            if(i1+1<m && board[i1+1][i2]=='O')
            {
                board[i1+1][i2] = '1';
                q.add((i1+1)*n+i2);
            }
            
            if(i2+1<n && board[i1][i2+1]=='O')
            {
                board[i1][i2+1] = '1';
                q.add(i1*n+i2+1);
            }
            if(i2-1>=0 && board[i1][i2-1]=='O')
            {
                board[i1][i2-1] = '1';
                q.add(i1*n+i2-1);
            }
        }
    }
}