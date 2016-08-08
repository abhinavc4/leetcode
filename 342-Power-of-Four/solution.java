public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num<=0)
        {
            return false;
        }
        if(num==1)
        {
            return true;
        }
        if(0==(num&(num-1)))
        {
            int val = (int)(Math.log(num)/Math.log(2));
            if((val%2)==0)
            {
                return true;
            }
        }
        return false;
    }
}