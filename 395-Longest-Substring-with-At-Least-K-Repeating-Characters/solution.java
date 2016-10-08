public class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length()==0||k==1)
        {
            return s.length();
        }
        if(s.length()<k)
        {
            return 0;
        }
        char[] count = new char[26];
        for(char c : s.toCharArray())
        {
            count[c-'a']++;
        }
        boolean flag = true;
        for(int i = 0 ; i < 26; i++)
        {
            if(count[i]!=0 && count[i]<k)
            {
                flag = false;
                break;
            }
        }
        if(flag)
        {
            return s.length();
        }
        char least = 0 ;
        for(int i = 0 ; i < 26 ; i++)
        {
            if(count[i]!=0 && least == 0){least = (char)(i+'a');continue;}
            if(count[i]!=0 && count[least-'a'] > count[i]){least = (char)(i+'a');}
        }
        
        int max = 0;
        String [] arr = s.split(least+"");
        for(String a : arr)
        {
            max = Math.max(max,longestSubstring(a,k));
        }
        return max;
    }
}