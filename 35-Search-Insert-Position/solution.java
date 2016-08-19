public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0)
        {
            return 0;
        }
        
        int left = 0;
        int right = nums.length-1;
        while(left <= right)
        {
            int mid = (left+right)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(target<nums[left])
            {
                return left;
            }
            if(target>nums[right])
            {
                return right+1;
            }
            if(target>nums[mid])
            {
                left = mid+1;
            }
            if(target<nums[mid])
            {
                right = mid-1;
            }
        }
        return left;
        
        
    }
}