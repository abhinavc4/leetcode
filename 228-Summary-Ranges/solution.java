public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l = new ArrayList<String>();
        if(nums.length == 0)
        {
            return l;
        }
        int prev = nums[0];
        int rangeStart = nums[0];
        for(int i = 1 ; i < nums.length ; i++)
        {
            if(nums[i] == prev+1 )
            {
                prev = nums[i];
            }
            else
            {
                if(prev == rangeStart)
                {
                    l.add(String.valueOf(prev));
                }
                else
                {
                    l.add(String.valueOf(rangeStart)+"->"+String.valueOf(prev));
                }
                rangeStart = nums[i];
                prev  = nums[i];
            }
        }
        if(prev == rangeStart)
        {
            l.add(String.valueOf(prev));
        }
        else
        {
            l.add(String.valueOf(rangeStart)+"->"+String.valueOf(prev));
        }
        return l;
    }
}