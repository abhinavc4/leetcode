public class Solution {
    public int integerBreak(int n) {
        if(n==2)return 1;
        if(n==3)return 2;
        if(n==4)return 4;
        int product = 0;
        if(n%3==0)
        {
            int result = (int)n/3;
            product = (int)Math.pow(3,result);
        }
        if(n%3==2)
        {
            int result = (int)n/3;
            product = (int)Math.pow(3,result)*2;
        }
        if(n%3==1)
        {
            int result = (int)(n-4)/3;
            product = (int)Math.pow(3,result)*4;
        }
        return product;
    }
}