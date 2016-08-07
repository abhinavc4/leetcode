public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;
        for(int i : prices)
        {
            minValue = Math.min(minValue,i);
            maxProfit = Math.max(maxProfit,i-minValue);
        }
        return maxProfit;
    }
}