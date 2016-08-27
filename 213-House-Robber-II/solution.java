public class Solution {
    public int rob(int[] nums) {
        
        if(nums==null||nums.length == 0)
        {
            return 0;
        }
        
        if(nums.length == 1 )
        {
            return nums[0];
        }
        
        if(nums.length == 2)
        {
            return Math.max(nums[0],nums[1]);
        }
        int val1 = returnMax(nums , 0 , nums.length-2);
        int val2 = returnMax(nums , 1 , nums.length-1);
        return Math.max(val1,val2);
    }
    
    int returnMax(int []nums , int low , int high)
    {
        if(low == high)
        {
            return nums[low];
        }
        
        int [] val = new int[nums.length];
        val [low]   = nums[low];
        val [low+1] = Math.max(val[low],nums[low+1]);
        
        for(int i = low+2 ; i <= high ; i++)
        {
            val[i] = Math.max(val[i-2]+nums[i],val[i-1]);
        }
        return Math.max(val[high],val[high-1]);
    }
}