public class Solution {
    public int trailingZeroes(int n) {
        if(n<0)
        {
            return 0;
        }
        for(int res = 0 ;;res+=(n/=5))
        {
            if(n==0)
            {
                return res;
            }
        }
    }
}