public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length ; i++)
        {
            Integer loc = hm.get(target-nums[i]);
            if(loc == null)
            {
                hm.put(nums[i],i);
            }
            else
            {
                return new int[]{loc,i};
            }
        }
        return new int[]{0,0};
    }
}