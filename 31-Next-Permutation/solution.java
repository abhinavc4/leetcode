//[1,2,3,4] -> [1,2,4,3]
//[1,2,4,3] -> [1,3,2,4]
//[1,3,2,4] -> [1,3,4,2]
//[1,3,4,2] -> [1,4,2,3]
public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length<2)
        {
            return;
        }
        int i = nums.length -2;
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }
        if(i>=0)
        {
            int j = nums.length-1;
            while(j>=0 && nums[j]<=nums[i])
            {
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
        
    }
    void swap(int[] arr , int i , int j )
    {
        int temp = arr[i];
        arr[i]   = arr[j];
        arr[j]   = temp;
    }
    
    void reverse(int[] arr , int index)
    {
        int i = index;
        int j = arr.length-1;
        while(i<j)
        {
            swap(arr,i++,j--);
        }
    }
}