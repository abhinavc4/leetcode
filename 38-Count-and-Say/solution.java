public class Solution {
    public String countAndSay(int n) {
        if(n<=0)
        {
            return "";
        }
        String s = new String();
        s+="1";
        while(n>1)
        {
            n--;
            String temp = new String();
            int count = 0;
            int num = s.charAt(0)-'0';
            for(int i = 0 ; i < s.length();i++)
            {
                if((s.charAt(i)-'0') == num)
                {
                    count++;
                }
                else
                {
                    temp+=count;
                    temp+=num;
                    count = 1;
                    num = s.charAt(i)-'0';
                }
                if(i == s.length()-1)
                {
                    temp+=count;
                    temp+=num;
                }
            }
            s = temp;
        }
        return s;
        
    }
}