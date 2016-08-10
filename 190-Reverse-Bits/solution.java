public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if(n==0)
        {
            return n;
        }
        int num = n;
        int msbF = 1<<31;
        int lsbF = 1;
        int val = 16;
        while(val>0)
        {
            val--;
            int msbBit = num&msbF;
            int lsbBit = num&lsbF;
            System.out.println(msbBit + lsbBit);
            if(msbBit!=0 ^ lsbBit!=0)
            {
                if(msbBit ==0)
                {
                    num = num | msbF;
                }
                else
                {
                    int temp = ~msbF;
                    num = num & temp;
                }
                
                if(lsbBit ==0)
                {
                    num = num | lsbF;
                }
                else
                {
                    int temp = ~lsbF;
                    num = num & temp;
                }
            }
            
            lsbF<<=1;
            msbF>>>=1;
        }
        return num;
    }
}