public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        helper(used , new ArrayList<Integer>(),l,nums);
        return l;
    }
    void helper(boolean[] used , List<Integer> al , List<List<Integer>> l , int[] nums)
    {
        if(al.size() == nums.length)
        {
            l.add(new ArrayList<Integer>(al));
            return;
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(used[i] == true)
            {
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] &&!used[i-1])
            {
                continue;
            }
            al.add(nums[i]);
            used[i] = true;
            helper(used,al,l,nums);
            used[i] = false;
            al.remove(al.size()-1);
        }
    }
}