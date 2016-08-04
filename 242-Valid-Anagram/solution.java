public class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int slen = s.length();
        int tlen = t.length();
        
        for(int i = 0 ; i < slen ; i++)
        {
            Integer count = hm.get(s.charAt(i)-'a');
            if(count == null)
            {
                count = 0;
            }
            hm.put(s.charAt(i)-'a',count+1);
        }
        
        for(int i = 0 ; i < tlen ; i++)
        {
            Integer count = hm.get(t.charAt(i)-'a');
            if(count == null)
            {
                return false;
            }
            count = count -1;
            if(count <= 0 )
            {
                hm.remove(t.charAt(i)-'a');
            }
            else
            {
                hm.put(t.charAt(i)-'a',count);
            }
        }
        return hm.isEmpty();
    }
}