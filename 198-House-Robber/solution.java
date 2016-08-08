public class Solution {
    public int rob(int[] nums) {
        int[] arrays = Arrays.copyOf(nums,nums.length);
        int maxAmt = 0;
        for(int i = 0 ; i < nums.length ;++i)
        {
            for(int j = 0 ; j < i-1 ; j++)
            {
                arrays[i] = Math.max(arrays[i],nums[i]+arrays[j]);
            }
            maxAmt = Math.max(maxAmt,arrays[i]);
        }
        return maxAmt;
    }
}