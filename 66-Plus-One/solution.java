public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int carry = 0;
        if(len == 0)
        {
            return digits;
        }
        
        digits[len-1] +=1;
        
        if(len ==1)
        {
            if(digits[0]==10)
            {
                return new int[]{1,0};
            }
            return digits;
        }
        for(int i = len-2 ; i>=0 ; i--)
        {
            if(digits[i+1]==10)
            {
                digits[i+1] = 0;
                digits[i] += 1;
            }
            else
            {
                break;
            }
        }
        if(digits[0]==10)
        {
            int[] arr = Arrays.copyOf(digits,len+1);
                Arrays.fill(arr,0);
                arr[0] =1;
                return arr;
        }
        return digits;
    }
}