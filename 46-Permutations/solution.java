public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        permuteHelper(nums,l,new ArrayList<Integer>());
        return l;
    }
    
    void permuteHelper(int []nums,List<List<Integer>> l,List<Integer> al)
    {
        if(nums.length == al.size())
        {
            l.add(new ArrayList<Integer>(al));
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(al.contains(nums[i]))
            {
                continue;
            }
            al.add(nums[i]);
            permuteHelper(nums,l,al);
            al.remove(al.size()-1);
        }
    }
}
