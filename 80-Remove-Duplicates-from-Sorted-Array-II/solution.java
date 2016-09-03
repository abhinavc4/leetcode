public class Solution {
    public int removeDuplicates(int[] nums) {
        int counter = 0;
        if(nums.length <= 2)
        {
            return nums.length;
        }
        //[1,2,2,2,3,3,3,4]
        //[1,1,2]
        //i : 1
        //c : 2
        //s : 2
        //u : 1
        int uniqElement = nums[counter];
        int state = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == uniqElement && state==0)
            {
                nums[counter++] = nums[i];
                state = 1;
            }
            else if(nums[i]==uniqElement && state==1)
            {
                nums[counter++] = nums[i];
                state = 2;
            }
            else if(nums[i]!=uniqElement)
            {
                nums[counter++] = nums[i];
                state = 1;
                uniqElement = nums[i];
            }
        }
        return counter;
    }
}