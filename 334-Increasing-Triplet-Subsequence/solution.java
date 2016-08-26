public class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        if(nums.length <=2)
        {
            return false;
        }
        
        int less = Integer.MAX_VALUE , secLess = Integer.MAX_VALUE;
        
        for(int i : nums)
        {
            if( i <= less)
            {
                less = i;
            }
            else if(i <= secLess)
            {
                secLess = i;
            }
            else if(i > secLess)
            {
                return true;
            }
        }
        return false;
    }
}