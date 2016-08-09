public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int tlen = t.length();
        int slen = s.length();
        if(slen!=tlen)
        {
            return false;
        }
        if(slen ==0)
        {
            return true;
        }
        HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> hm2 = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < tlen ; i++)
        {
            Integer chS = s.charAt(i)-'0';
            Integer chT = t.charAt(i)-'0';
            
            Integer value = hm1.get(chS);
            Integer value2 = hm2.get(chT);
            if(!((value ==null && value2 == null)
            || (value == chT && value2 == chS)))
            {
                return false;
            }
            if(value == null)
            {
                hm1.put(chS,chT);
                hm2.put(chT,chS);
            }
        }
        return true;
    }
}