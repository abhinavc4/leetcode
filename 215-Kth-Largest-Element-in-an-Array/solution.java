public class Solution {
    
    public int findKthLargest(int[] nums, int k) {
        return helper(nums , 0 , nums.length-1,k);
    }
    
    int helper(int[] nums,int left , int right , int k)
    {
        Random r = new Random(0);
        while(left<=right)
        {
            int pivotIdx = r.nextInt(right-left+1)+left;
            int newIdx = quick(nums,left,right,pivotIdx);
            if(newIdx == k-1)
            {
                return nums[newIdx];
            }
            else if(newIdx>k-1)
            {
                right = newIdx - 1;
            }
            else
            {
                left = newIdx +1;
            }
        }
        return nums[left];
    }
    
    int quick(int [] nums,int left , int right , int pivotIdx)
    {
        int pivotVal = nums[pivotIdx];
        swap(nums,pivotIdx,right);
        int newIdx = left;
        for(int i = left ; i < right ; i++)
        {
            if(Integer.compare(nums[i],pivotVal)>0)
            {
                swap(nums,i,newIdx++);
            }
        }
        swap(nums,right,newIdx);
        return newIdx;
    }
    
    void swap(int [] arr,int a , int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}