public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        if(x<10)
        {
            return true;
        }
        int size = (int)Math.floor(Math.log10(x))+1;
        while(size>1)
        {
            int sDig = (int)(x/Math.pow(10,size-1));
            int tDig = x%10;
            if(sDig!=tDig)
            {
                return false;
            }
            x = (int)(x%(Math.pow(10,size-1)));
            x = x/10;
            size = size-2;
        }
        return true;
    }
}