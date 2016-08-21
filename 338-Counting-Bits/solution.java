public class Solution {
    public int[] countBits(int num) {
        int[] ret = new int[num+1];
        int pow = 1;
        int t = 0;
        ret[0] = 0;
        for(int i = 1 ;i<=num;i++,t++)
        {
            if(i==pow)
            {
                pow*=2;
                t = 0;
            }
            ret[i] = ret[t]+1;
        }
        return ret;
    }
}