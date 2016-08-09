public class Solution {
    public int removeDuplicates(int[] nums) {
     int len = nums.length;
     if(len == 0 || len ==1)
     {
         return len;
     }
     int curr = 1;
     for(int i = 1 ; i < len ; i++)
     {
         if(nums[i]!=nums[curr-1])
         {
             nums[curr++]=nums[i];
         }
     }
     return curr;
     
    }
}