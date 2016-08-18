public class Solution {
    public int missingNumber(int[] nums) {
        int actualSum = 0;
        int len = nums.length;
        if(len ==0 )
        {
            return 0;
        }
        actualSum = ((len+1)*(len+2))/2;
        int tempSum = 0;
        for(int i : nums)
        {
            tempSum +=i+1;
        }
        return actualSum-tempSum-1>0?actualSum-tempSum-1:0;
    }
}