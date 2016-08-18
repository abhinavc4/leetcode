public class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        if(len==0)
        {
            return 0;
        }
        int res = nums[0];
        for(int i =1 ; i < len ; i++)
        {
            res ^= nums[i];
        }
        return res;
    }
}