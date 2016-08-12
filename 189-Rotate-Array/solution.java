public class Solution {
    public void rotate(int[] nums, int k) {
        int count = nums.length;
        if(k<=0)
        {
            return;
        }
        if(count==0 || count==1)
        {
            return;
        }
        if(count == k)
        {
            return;
        }
        int i = 0 ;
        int otherB = nums[i];
        int maxElem = Integer.MIN_VALUE;
        for(int j = 0 ; j < count ; j++)
        {
            maxElem = Math.max(nums[j],maxElem);
        }
        int len = nums.length;
        while(count>0)
        {
            count--;
            int dElem = 0;
            while(nums[(dElem = (i+k)%len)]>maxElem)
            {
                if(i<len)
                {
                    i++;
                    otherB = nums[i];
                }
                else
                {
                    i = 0;
                }
            }
            int backup = nums[dElem];
            nums[dElem] = maxElem+1+otherB;
            i = dElem;
            otherB = backup;
        }
        for(int j = 0 ; j < len ; j++)
        {
            nums[j]-=(maxElem+1);
        }
        return;
        
    }
}