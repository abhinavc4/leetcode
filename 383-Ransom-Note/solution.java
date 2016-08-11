public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> magMap = new HashMap<Character,Integer>();
        int rLen = ransomNote.length();
        int mLen = magazine.length();
        char [] chRansom = ransomNote.toCharArray();
        char [] chMag = magazine.toCharArray();
        if(rLen == 0)
        {
            return true;
        }
        if(mLen == 0)
        {
            return false;
        }
        for(char ch : chMag)
        {
            Integer val = magMap.get(ch);
            if(val == null)
            {
                val = 0;
            }
            magMap.put(ch,val+1);
        }
        for(char ch : chRansom)
        {
            Integer val = magMap.get(ch);
            if(val == null)
            {
                return false;
            }
            val--;
            if(val == 0)
            {
                magMap.remove(ch);
            }
            else
            {
                magMap.put(ch,val);
            }
        }
        return true;
    }
}