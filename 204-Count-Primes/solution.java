public class Solution {
    public int countPrimes(int n) {
        n--;
        if(n<=1)
        {
            return 0;
        }
        int[] a = new int[n];
        for(int i =0 ; i < n ; i++)
        {
            a[i] = i+1;
        }
        a[0]=-1;
        int curr = 0;
        int root = (int)Math.sqrt(n);
        for(curr = 0 ; curr <= root ; curr++)
        {
            if(a[curr] == -1)
            {
                continue;
            }
            for(int i = curr +a[curr]; i < n ; i = i+a[curr])
            {
                a[i]=-1;
            }
        }
        int count = 0;
        for(int i : a)
        {
            if(i!=-1)
            {
                count++;
            }
        }
        return count;
    }
}