public class Solution {
    int returnCommon(String one , String two)
    {
        int min = Math.min(one.length(),two.length());
        int i = 0 ;
        while(i<min)
        {
            if(one.charAt(i) != two.charAt(i))
            {
                return i;
            }
            i++;
        }
        return i;
    }
    public String longestCommonPrefix(String[] strs) {
        String lpref = new String();
        if(strs.length == 0)
        {
            return lpref;
        }
        lpref = strs[0];
        for(int i = 1 ; i < strs.length  ; i++)
        {
            int len = returnCommon (lpref,strs[i]);
            if(len == 0)
            {
                lpref = "";
                break;
            }
            else
            {
                lpref = lpref.substring(0,len);
            }
        }
        return lpref;
    }
}