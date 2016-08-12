public class Solution {
    public int countPrimes(int n) {
        if(n<=1)
        {
            return 0;
        }
        boolean [] a = new boolean[n];
        for(int i =2 ; i < n ; i++)
        {
            a[i] = true;
        }
        for(int curr = 0 ; curr*curr <= n ; curr++)
        {
            if(a[curr] == false)
            {
                continue;
            }
            for(int i = curr*curr; i < n ; i = i+curr)
            {
                a[i]=false;
            }
        }
        int count = 0;
        for(boolean i : a)
        {
            if(i==true)
            {
                count++;
            }
        }
        return count;
    }
}