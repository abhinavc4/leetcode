public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        if(nums.length==0)
        {
            return al;
        }
        int c1=0 ;
        int c2=0;
        int ca1=nums[0];
        int ca2=nums[0];
        for(int n:nums)
        {
            if(n == ca1)
            {
                c1++;
            }
            else if(n == ca2)
            {
                c2++;
            }
            else if(c1 == 0)
            {
                ca1 = n;
                c1++;
            }
            else if(c2 == 0)
            {
                ca2 = n;
                c2++;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int n : nums)
        {
            if(n==ca1)
            {
                c1++;
            }
            else if(n==ca2)
            {
                c2++;
            }
        }
        if(c2>nums.length/3)
        {
            al.add(ca2);
        }
        if(c1>nums.length/3)
        {
            al.add(ca1);
        }
        
        return al;
    }
}