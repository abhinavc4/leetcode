public class Solution {
    public double myPow(double x, int n) {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 1/x*myPow(1/x,-(n+1));
        }
        double y = myPow(x,n/2);
        double z = y*y;
        return n%2==0 ? z : (z*x);
    }
}