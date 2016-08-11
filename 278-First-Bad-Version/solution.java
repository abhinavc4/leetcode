/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int mid = low;
        int high = n;
        while(low>=1 && high <=n)
        {
            mid = low + (high-low)/2;
            if(isBadVersion(mid))
            {
                if(mid == 1)
                {
                    return mid;
                }
                if(isBadVersion(mid-1))
                {
                    high = mid-2;
                }
                else
                {
                    return mid;
                }
            }
            else
            {
                low = mid+1;
            }
            
        }
        return n;
    }
}