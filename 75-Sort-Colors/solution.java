public class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0||nums.length ==1)
        {
            return ;
        }
        int i = 0 ; 
        int j = nums.length-1;
        int u = 0;
        while(u<=j)
        {
            if(nums[u] == 0)
            {
                swap(nums,u++,i++);
            }
            else if(nums[u]==2)
            {
                swap(nums,u,j--);
            }
            else
            {
                u++;
            }
        }
    }
    void swap(int[] arr,int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}