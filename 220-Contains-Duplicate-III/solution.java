public class Solution {
    long getID(long num , long w)
    {
        return num<0?(num+1)/w-1:num/w;        
    }
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        HashMap<Long,Long> hm = new HashMap<Long,Long>();
        if(t<0)
        {
            return false;
        }
        long w = (long)t + 1;
        for(int i = 0 ; i < nums.length ; i++)
        {
            long m = getID(nums[i],w);
            if(hm.containsKey(m))
            {
                return true;
            }
            if(hm.containsKey(m-1)&&(Math.abs(nums[i]-hm.get(m-1))<w))
            {
                return true;
            }
            if(hm.containsKey(m+1)&&(Math.abs(nums[i]-hm.get(m+1))<w))
            {
                return true;
            }
            hm.put(m,(long)nums[i]);
            if(i >= k && hm.containsKey(getID((long)nums[i-k],w)))
            {
                hm.remove(getID((long)nums[i-k],w));
            }
        }
        return false;
    }
}