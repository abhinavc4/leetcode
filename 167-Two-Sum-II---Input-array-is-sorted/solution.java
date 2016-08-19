public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0 ; 
        int len = numbers.length;
        int j = len-1;
        while(i<j)
        {
            if(numbers[i]+numbers[j]==target)
            {
                break;
            }
            else if((numbers[i]+numbers[j])<target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return new int[]{i+1,j+1};
    }
}