public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length ==0)
        {
            return 0;
        }
        int maxProfit = nums[0];
        for(int i = 1 ; i < nums.length ; i++)
        {
            nums[i]= Math.max(nums[i],nums[i]+nums[i-1]);
            maxProfit = Math.max(nums[i],maxProfit);
        }
        return maxProfit;
        
    }
}