public class Solution {

    int [] resetArray;
    int [] otherArray;
    Random r = null;
    int l = 0;
    public Solution(int[] nums) {
        resetArray = Arrays.copyOf(nums,nums.length);
        otherArray = Arrays.copyOf(nums,nums.length);
        r = new Random();
        l = otherArray.length;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        otherArray = Arrays.copyOf(resetArray,l);
        return otherArray;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(l==0)
        {
            return otherArray;
        }
        for(int i = 1 ; i < l;i++ )
        {
            int swapIndex = r.nextInt(i+1); 
            swap(otherArray,i,swapIndex);
        }
        return otherArray;
    }
    
    void swap(int arr[],int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */