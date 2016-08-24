public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        if( n<=0 || k<=0)
        {
            return l;
        }
        helper(n,k,1,new ArrayList<Integer>(),l);
        return l;
    }
    void helper(int n , int k , int i , ArrayList<Integer> al ,List<List<Integer>> l )
    {
        if(al.size()==k)
        {
            l.add(new ArrayList<Integer>(al));
            return;
        }
        for(int j = i ; j <=n;j++)
        {
            al.add(j);
            helper(n,k,j+1,al,l);
            al.remove(al.size()-1);
        }
    }
}