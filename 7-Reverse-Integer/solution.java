public class Solution {
    public int reverse(int x) {
        long sum = 0;
        boolean isNeg = false;
        if(x<0)
        {
            isNeg = true;
            x = x*-1;
        }
        int numOfDigs = (int)Math.log10(x);
        while(x>0)
        {
            if(sum>Integer.MAX_VALUE/10)
            {
                return 0;
            }
            int temp = x%10;
            sum = sum*10+temp;
            x = x/10;
        }
        
        
        
        if(isNeg)
        {
            sum = sum*-1;
        }
        if(sum<Integer.MIN_VALUE)
        {
            sum = 0;
        }
        if(sum>Integer.MAX_VALUE)
        {
            sum = 0;
        }

        return (int)sum;
    }
}