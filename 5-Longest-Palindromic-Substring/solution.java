public class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==0 || s.length()==1)
        {
            return s;
        }
        int start = 0;
        int end = 0;
        for(int i = 0 ; i < s.length();i++)
        {
            int len1 = retMax(i,i,s);
            int len2 = retMax(i,i+1,s);
            int len = Math.max(len1,len2);
            if(len>(end-start))
            {
                start = i - (len-1)/2;
                end =   i +  len/2;
            }
        }
        return s.substring(start,end+1);
    }
    int retMax(int left,int right,String s )
    {
        int l = left;
        int r = right;
        while(l >= 0&& r<s.length() && s.charAt(l)==s.charAt(r))
        {
            l--;
            r++;
        }
        return r-l-1;
    }
}