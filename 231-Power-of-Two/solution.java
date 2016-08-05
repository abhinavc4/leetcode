public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
        {
            return false;
        }
        n = Math.abs(n);
        if((0==(n&(n-1))))
        {
            return true;
        }
        return false;
    }
}