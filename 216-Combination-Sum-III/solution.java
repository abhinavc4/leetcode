public class Solution {
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        helper(k,n,1,l,new ArrayList<Integer>());
        return l;
    }
    
    void helper(int k , int n ,int j , List<List<Integer>> l , List<Integer> al)
    {
        if(n == 0 && al.size() == k)
        {
            l.add(new ArrayList<Integer>(al));
            return;
        }
        if(n <= 0 || al.size() >= k)
        {
            return ;
        }
        for(int i = j ; i < 10 ; i++)
        {
            if(i>n)
            {
                break;
            }
            al.add(i);
            helper(k,n-i,i+1,l,al);
            al.remove(al.size()-1);
        }
    }
}