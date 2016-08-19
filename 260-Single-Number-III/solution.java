public class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length <=2)
        {
            return nums;
        }
        int diff = nums[0];
        for(int i = 1; i < nums.length ; i++)
        {
            diff^=nums[i];    
        }
        diff = diff&~(diff-1);
        int val[] = new int[]{0,0};
        for(int num:nums)
        {
            if((diff&num)==0)
            {
                val[0]^=num;    
            }
            else
            {
                val[1]^=num;
            }
        }
        return val;
    }
}