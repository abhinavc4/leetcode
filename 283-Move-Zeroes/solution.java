public class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero = 0;
        int len = nums.length;
        for(int i = 0 ; i<len;++i)
        {
            if(nums[i] != 0)
            {
                nums[nonZero++] = nums[i];
            }
        }
        for(int i = nonZero ; i<len;i++)
        {
            nums[i]=0;
        }
    }
}