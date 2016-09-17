public class Solution {
    public int maxProduct(int[] nums) {
        int r = nums[0];
        for(int i = 1 , min = r,max = r; i<nums.length ; i++)
        {
            if(nums[i]<0)
            {
                int temp = min;
                min = max;
                max = temp;
            }
            min = Math.min(nums[i],nums[i]*min);
            max = Math.max(nums[i],nums[i]*max);
            r = Math.max(r,max);
        }
        return r;
    }
}