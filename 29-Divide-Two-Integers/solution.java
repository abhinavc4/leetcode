public class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0)
        {
            return Integer.MAX_VALUE;
        }
        if(dividend==Integer.MIN_VALUE && divisor ==-1)
        {
            return Integer.MAX_VALUE;
        }
        if(divisor ==1)
        {
            return dividend;
        }
        boolean sign = false;
        
        if((dividend > 0 && divisor > 0)||
        (dividend < 0 && divisor < 0))
        {
           sign = true;
        }
        int res = 0;
        long pdivd = Math.abs((long)(dividend));
        long pdivi = Math.abs((long)(divisor));
        while(pdivd>=pdivi)
        {
            long temp = pdivi;
            long multiple = 1;
            while(pdivd>=(temp<<1))
            {
                temp <<=1;
                multiple <<=1;
            }
            pdivd -= temp;
            res += multiple;
        }
        if(sign)
        {
            return res;
        }
        else
        {
            return -res;
        }
    }
}