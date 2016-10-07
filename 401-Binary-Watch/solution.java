public class Solution {
    public List<String> readBinaryWatch(int num) {
        int count = 0;
        List<String> l = new ArrayList<String>();
        for(int i =  0 ; i < 12 ; i++)
        {
            for(int j = 0 ; j < 60 ; j++)
            {
                if((Integer.bitCount(i)+Integer.bitCount(j))==num)
                {
                    l.add(String.format("%d:%02d",i,j));
                }
            }
        }
        return l;
    }
}