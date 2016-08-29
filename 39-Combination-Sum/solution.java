public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        helper(l , new ArrayList<Integer>(), 0 , candidates , target);
        return l;
    }
    void helper(List<List<Integer>> l,List<Integer> al , int i , int[] c , int t)
    {
        int sum =0 ;
        for(int elem : al)
        {
            sum += elem;
        }
        if(sum>t)
        {
            return;
        }
        if(sum == t)
        {
            l.add(new ArrayList<Integer>(al));
            return;
        }
        for(int j = i ; j < c.length ; j++)
        {
            if(j>t)
            {
                continue;
            }
            al.add(c[j]);
            helper(l , al, j ,c , t);
            al.remove(al.size()-1);
        }
    }
}