public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int z;
        int len = nums.length -1;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length<4)
        {
            return res;
        }

        int max = nums[len];
        
        for(int i = 0 ; i < len ; i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            threeSum(nums,i+1,len,target-nums[i],nums[i],res);
        }
        return res;
    }
    public void threeSum(int[] nums, int begin , int end , int target , int z1,List<List<Integer>> res)
    {
        int z2;
        int max = nums[end];
        for(int i = begin ; i <end ; i++)
        {
            if(i>begin && nums[i]==nums[i-1])
            {
                continue;
            }
            twoSum(nums,i+1,end,target-nums[i],z1 ,nums[i],res);       
        }
    }
    
    public void twoSum(int[] nums, int begin , int end , int target ,int z1, int z2 , List<List<Integer>> res)
    {
        int i = begin;
        int j = end; 
        int sum;
        while(i<j)
        {
            sum = nums[i] + nums[j];
            if(sum == target)
            {
                res.add(Arrays.asList(z1,z2,nums[i],nums[j]));
                int x = nums[i];
                while(++i<j && nums[i]==x);
                int y = nums[j];
                while(i<--j && nums[j]==y);
            }
            if(sum<target)
            {
                i++;
            }
            if(sum>target)
            {
                j--;
            }
        }
        return;
    }
}