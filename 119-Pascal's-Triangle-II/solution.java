public class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex<0)
        {
            return null;
        }
        rowIndex++;
        List<Integer> l = new ArrayList<Integer>();
        for(int i = 0 ; i < rowIndex ; i++)
        {
            l.add(0);
            for(int j = i ; j >=0;j--)
            {
                if(j==i||j==0)
                {
                    l.set(j,1);
                }
                else
                {
                    l.set(j,l.get(j)+l.get(j-1));
                }
            }
        }
        return l;
    }
}