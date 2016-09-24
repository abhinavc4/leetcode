public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> al = new HashSet<String>();
        HashSet<String> hs = new HashSet<String>();
        for(int i = 0 ; i < Math.max(s.length()-10+1,0) ; i++)
        {
            if(!hs.add(s.substring(i,i+10)))
            {
                al.add(s.substring(i,i+10));
            }
        }
        return new ArrayList<String>(al);
    }
}