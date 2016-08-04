

public class Solution {
    public int getSum(int a, int b) {
        int sum = 0 ;
        int carry = 0;
        int count = 0;
        while(a!=0||b!=0)
        {
            int a1 = (a&1);
            int b1 = (b&1);
            a = a>>1;
            b = b>>1;
            int tempSum = a1^b1^carry;
            carry = (a1&b1)|(a1&carry)|(b1&carry);
            tempSum = tempSum<<count++;
            sum = sum|tempSum;
        }
        return (sum|carry<<count);
    }
}