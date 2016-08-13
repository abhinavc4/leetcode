public class Solution {
    public int strStr(String haystack, String needle) {
        int base = 26;
        int powerS = 0;
        int thash = 0;
        int shash = 0;
        int nLen = needle.length();
        int hLen = haystack.length();
        if(nLen==0)
        {
            return 0;
        }
        if(nLen>hLen)
        {
            return -1;
        }
        if(nLen==hLen && haystack.equals(needle))
        {
            return 0;
        }
        
        for(int i = 0; i<nLen;i++)
        {
            if(i==0)
            {
                powerS = 1;
            }
            else
            {
                powerS = powerS*base;
            }
            thash = thash*base + haystack.charAt(i);
            shash = shash*base + needle.charAt(i);
        }
        for(int i=nLen;i<hLen;i++)
        {
            if(thash == shash)
            {
                if(needle.equals(haystack.substring(i-nLen,i)))
                {
                    return i-nLen;
                }
            }
            
            thash -= haystack.charAt(i-nLen)*powerS;
            thash = thash*base + haystack.charAt(i);
        }
        if(thash == shash)
        {
            if(needle.equals(haystack.substring(hLen-nLen,hLen)))
            {
                return hLen-nLen;
            }
        }
        return -1;
    }
}