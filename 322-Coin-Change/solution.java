public class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        int sum = 0;
        while(++sum<=amount)
        {
            int min = -1;
            for(int coin : coins)
            {
                if(sum >= coin && dp[sum-coin]!=-1)
                {
                    int temp = dp[sum-coin]+1;
                    if(min<0)
                    {
                        min = temp;
                    }
                    else
                    {
                        min = Math.min(temp,min);
                    }
                }
            }
            dp[sum] = min;
        }
        return dp[amount];
    }
}