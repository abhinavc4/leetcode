public class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<0)
        {
            return false;
        }
        if(num==0||num==1)
        {
            return true;
        }
        int start = 1;
        int end = num/2;
        while(start<=end)
        {
            long mid = start + (end-start)/2;
            if(mid*mid == num)
            {
                return true;
            }
            if(mid*mid<num)
            {
                start = (int)mid+1;
            }
            else if(mid*mid>num)
            {
                end = (int)mid-1;
            }
        }
        return false;
        
    }
}