public class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        int slen = s.length();
        int tlen = t.length();
        
        for(int i = 0 ; i < slen ; i++)
        {
            char ch = s.charAt(i);
            Integer count = hm.get(ch);
            if(count == null)
            {
                count = 0;
            }
            hm.put(ch,count+1);
        }
        
        for(int i = 0 ; i < tlen ; i++)
        {
            char ch = t.charAt(i);
            Integer count = hm.get(ch);
            if(count == null)
            {
                return false;
            }
            count = count -1;
            if(count <= 0 )
            {
                hm.remove(ch);
            }
            else
            {
                hm.put(ch,count);
            }
        }
        return hm.isEmpty();
    }
}