public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int[] a = new int[]{-1,-1};
        
        if(nums.length ==1)
        {
            return nums[0]==target?new int[]{0,0}:new int[]{-1,-1};
        }
        int right = nums.length-1;
        
        while(left<right)
        {
            int mid = (right-left)/2 + left;
            if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid;
            }
        }
        if(nums[left] != target)
        {
            return a;
        }
        a[0] = left;
        right = nums.length-1;
        while(left<right)
        {
            int mid = (right-left)/2 + left + 1;
            if(nums[mid]>target)
            {
                right = mid-1;
            }
            else
            {
                left = mid;
            }
        }
        a[1] = right;
        return a;
    }
}