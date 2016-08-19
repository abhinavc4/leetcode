public class Solution {
    public int singleNumber(int[] nums) {
        int a = 0 ;
        int b = 0;
        int bitmask = 0;
        for(int i : nums)
        {
            b |= i&a ;
            a = a^i;
            bitmask = ~(a&b);
            a = a&bitmask;
            b = b&bitmask;
        }
        return a;
    }
}