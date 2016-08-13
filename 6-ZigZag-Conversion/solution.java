public class Solution {
    public String convert(String s, int numRows) {
        
        char[] ch = s.toCharArray();
        int len = ch.length;
        int i = 0 ;
        if(len == 0)
        {
            return s;
        }
        if(numRows>=len)
        {
            return s;
        }
        StringBuilder[] st = new StringBuilder[numRows];
        for(int j = 0 ; j < numRows;j++)
        {
            st[j] = new StringBuilder();
        }
        while(i<len)
        {
            for(int idx = 0 ; idx<numRows && i<len ; idx++)
            {
                st[idx].append(ch[i++]);
            }
            for(int idx = numRows -2 ; idx>=1&&i<len ;idx--)
            {
                st[idx].append(ch[i++]);
            }
        }
        
        for(int idx = 1 ; idx<numRows;idx++)
        {
            st[0].append(st[idx]);
        }
        return st[0].toString();
        
    }
}