public class Solution {
    HashMap<Integer,Integer> s = new HashMap<Integer,Integer>(); 
    public int climbStairs(int n) {
        if(n<0)
        {
            return 0;
        }
        if(n==1||n==0)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        if(s.containsKey(n))
        {
            return s.get(n);
        }
        int left = climbStairs(n-1);
        int right =  climbStairs(n-2);
        s.put(n-1,left);
        s.put(n-2,right);
        s.put(n,left+right);
        return left + right;
    }
}