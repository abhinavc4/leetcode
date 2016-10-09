public class Solution {
    public boolean canPartition(int[] nums) {
        
        if(nums==null||nums.length==0)
        {
            return false;
        }
        int volumn  = 0;
        
        for(int n : nums)
        {
            volumn  += n;
        }
        
        if(volumn%2 != 0)
        {
            return false;
        }
    
        volumn /= 2;
        boolean arr[] = new boolean[volumn + 1];
        arr[0] = true;
        
        for(int i = 1 ; i <= nums.length ; i++)
        {
            for(int j = volumn ; j >= nums[i-1] ; j--)
            {
                arr[j] = arr[j] || arr[j-nums[i-1]];
            }
        }
        
        return arr[volumn];
    }
}