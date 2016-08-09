public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        for(int i = 0 ; i < numRows;i++)
        {
            List<Integer> al = new ArrayList<Integer>();
            for(int j = 0 ; j < i+1 ; j++)
            {
                if(j==0||j==i)
                {
                    al.add(1);
                }
                else
                {
                    al.add(l.get(i-1).get(j-1)+l.get(i-1).get(j));
                }
            }
            l.add(al);
        }
        return l;
    }
}