public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        
        List<Integer> ls = new ArrayList<Integer>();
        if(nums == null || nums.length ==0)
        {
            return ls;
        }
        Arrays.sort(nums);
        int [] arr = new int[nums.length];
        arr[0]=1;
        for(int i = 1 ; i < nums.length ; i++)
        {
            for(int j = i-1;j >= 0;j--)
            {
                if(nums[i]%nums[j]==0)
                arr[i] = Math.max(arr[i],arr[j]+1);
            }
        }
        
        int maxIndex = 0;
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[maxIndex]<arr[i])
            {
                maxIndex = i;    
            }
        }
        
        int value = arr[maxIndex];
        int ind = nums[maxIndex];
        for(int i = maxIndex ; i>= 0 ; i--)
        {
            if((arr[i]==value) && (ind % nums[i]==0))
            {
                ls.add(nums[i]);
                value--;
            }
        }
        return ls;
    }
}