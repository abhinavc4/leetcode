public class Solution {
    
    int[] nums;
    Random r;
    public Solution(int[] nums) {
        this.nums = nums;
        r = new Random();
    }
    
    public int pick(int target) {
        int result = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] != target)
            {
                continue;
            }
            if(r.nextInt(++count)==0)
            {
                result = i;
            }
        }
        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */