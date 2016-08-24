public class Solution {
    public int[][] generateMatrix(int n) {
        
        int row = 0;
        int col = 0;
        int num = 1;
        int counter = 0;
        int[][] arr = new int[n][n];
        int[][] nextStep= {{0,1},{1,0},{0,-1},{-1,0}};
        int nexrow = 0;
        int nexcol = 0;
        while(num <= n*n)
        {
            arr[row][col] = num++;    
            
            nexrow = row+ nextStep[counter][0];
            nexcol = col+ nextStep[counter][1];
            
            if(nexrow<0 || nexrow >n-1
            ||nexcol<0 || nexcol > n-1 ||
            arr[nexrow][nexcol]!=0)
            {
                counter = (counter+1)%4;
                nexrow = row+ nextStep[counter][0];
                nexcol = col+ nextStep[counter][1];
            }
            row = nexrow ;
            col = nexcol ;
        }
        return arr;
    }
}