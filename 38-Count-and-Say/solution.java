public class Solution {
    public String countAndSay(int n) {
        if(n<=0)
        {
            return "";
        }
        StringBuilder s = new StringBuilder();
        s.append(1);
        while(n>1)
        {
            n--;
            StringBuilder temp = new StringBuilder();
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
                    temp.append(count);
                    temp.append(num);
                    count = 1;
                    num = s.charAt(i)-'0';
                }
                if(i == s.length()-1)
                {
                    temp.append(count);
                    temp.append(num);
                }
            }
            s = temp;
        }
        return s.toString();
        
    }
}