public class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
        HashMap<String,Integer> hm2 = new HashMap<String,Integer>();
        
        int pLen = pattern.length();
        if(pLen==0)
        {
            if(str.length()==0)
            {
                return true;
            }
            return false;
        }
        
        String[] strArray = str.split(" ");
        int sLen = strArray.length;
        if(sLen != pLen)
        {
            return false;
        }
        for(int i = 0 ; i < pLen ; i++)
        {
            Integer patInt = pattern.charAt(i)-'a';
            String sVal = hm1.get(patInt);
            Integer iVal = hm2.get(strArray[i]);
            if(!(((sVal == null) && (iVal == null))||
            ( (true == strArray[i].equals(sVal)) && (patInt==iVal))))
            {
                return false;
            }
            if(sVal == null)
            {
                hm1.put(patInt,strArray[i]);
                hm2.put(strArray[i],patInt);
            }
        }
        return true;
    }
}