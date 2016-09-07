public class Solution {
    public int nthUglyNumber(int n) {
        int[] array = new int[n];
        int index2 = 0 ;
        int index3 = 0 ;
        int index5 = 0;
        int factor2 = 2 ; 
        int factor3 = 3 ; 
        int factor5 = 5;
        array[0] = 1;
        for(int i = 1 ;i < n ; i++)
        {
            int min = Math.min(Math.min(factor2,factor3),factor5);
            array[i] = min;
            if(min == factor2)
            {
                factor2 = 2*array[++index2];
            }
            if(min == factor3)
            {
                factor3 = 3*array[++index3];
            }
            if(min == factor5)
            {
                factor5 = 5*array[++index5];
            }
        }
        return array[n-1];
    }
}