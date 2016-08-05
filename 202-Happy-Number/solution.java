public class Solution {
    public int retSumOfDigits(int num)
    {
        int sum = 0;
        
        while(num!=0)
        {
            int tensDigit = num%10;
            sum += tensDigit*tensDigit;
            num = num/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        if(n<=0)
        {
            return false;
        }
        HashSet<Integer> hs = new HashSet<Integer>();
        int ans = n;
        hs.add(ans);
        while(ans!=1)
        {
            ans = retSumOfDigits(ans);
            if(!hs.add(ans))
            {
                return false;
            }
        }
        return ans ==1;
    }
}