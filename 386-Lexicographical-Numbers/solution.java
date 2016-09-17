public class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        for(int i = 1 , prev = 1;i<n;i++)
        {
            if(prev*10<=n)
            {
                prev*=10;
            }
            else
            {
                while(prev%10==9||prev==n)
                {
                    prev/=10;
                }
                prev++;
            }
            l.add(prev);
        }
        return l;
    }
}