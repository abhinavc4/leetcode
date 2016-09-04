public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int start = 0 , end = 0 , sum = 0 , minLen = Integer.MAX_VALUE;
        while(end<nums.length)
        {
            while(end<nums.length && sum < s)
            {
                sum += nums[end++];
            }
            if(sum<s)
            {
                break;
            }
            while(start<end && sum >= s)
            {
                sum -= nums[start++];
            }
            if(end-start+1 < minLen)
            {
                minLen = end-start+1;
            }
        }
        if(minLen == Integer.MAX_VALUE)
        {
            return 0;
        }
        else
        {
            return minLen;
        }
    }
}