public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> magMap = new HashMap<Character,Integer>();
        int rLen = ransomNote.length();
        int mLen = magazine.length();
        if(rLen == 0)
        {
            return true;
        }
        if(mLen == 0)
        {
            return false;
        }
        for(int i = 0 ; i < mLen ; i++)
        {
            char ch = magazine.charAt(i);
            Integer val = magMap.get(ch);
            if(val == null)
            {
                val = 0;
            }
            magMap.put(ch,val+1);
        }
        for(int i = 0 ; i < rLen ; i++)
        {
            char ch = ransomNote.charAt(i);
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