public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0||nums.length==1)
        {
            return nums.length;
        }
        int[] val = new int[nums.length];
        Arrays.fill(val,1);
        int max = 1;
        //[10, 9, 2, 5, 3, 7, 101, 18]
        //[1,  1, 1, 2, 2, 3,   1,  1]
        for(int i = 1 ; i<val.length ; i++)
        {
            for(int j = 0 ; j < i ; j++)
            {
                if(nums[i]>nums[j])
                {
                    val[i] = Math.max(val[i],val[j]+1);
                    max = Math.max(val[i],max);
                }
            }
        }
        return max;
    }
}