public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        
        if(n==0)
        {
            return 1;
        }
        int availableDig = 9;
        int res = 10;
        int uniqueDig = 9;
        while(n-- > 1 && availableDig>0)
        {
            uniqueDig*=availableDig;
            res+=uniqueDig;
            availableDig--;
        }
        return res;
    }
}