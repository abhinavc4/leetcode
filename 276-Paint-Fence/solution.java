public class Solution {
    public int numWays(int n, int k) {
    if(k==0)
    {
        return 0;
    }
    int a[] = new int[]{0,k,k*k,0};
    if(n==0)
    {
        return 0;
    }
    if(n<=2)
    {
        return a[n];
    }
    //If both of previous fences are the same colors the total is k for both fences and k-1 for this fence
    //If both of the previous fences are different colors it is k for the first , k-1 for the second and k for the current 
    for(int i = 2;i<n;i++)
    {
        a[3] = (k-1)*(a[1]+a[2]);
        a[1] = a[2];
        a[2] = a[3];
        
    }
    return a[3];
    }
}