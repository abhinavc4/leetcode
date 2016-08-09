public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        if(len == 0)
        {
            return false;
        }
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0 ; i < k && i < len ; i++)
        {
            if(false==hs.add(nums[i]))
            {
                return true;
            }
        }
        for(int i = k ; i < nums.length ; i++)
        {
            if(false == hs.add(nums[i]))
            {
                return true;
            }
            hs.remove(nums[i-k]);
        }
        return false;
        
    }
}