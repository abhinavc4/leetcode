public class Solution {
    public int calculate(String s) {
        s = s.trim().replaceAll(" +","");
        long res = 0;
        long preVal = 0;
        char sign = '+';
        int i = 0;
        int len = s.length();
        System.out.println(s);
        while(i<len)
        {
            long currVal = 0;
            while(i<len && Character.isDigit(s.charAt(i)))
            {
                currVal = currVal*10 + s.charAt(i)-'0';
                i++;
            }
            if(sign == '+')
            {
                res+=preVal;
                preVal = currVal;
            }
            else if(sign == '-')
            {
                res+=preVal;
                preVal = -currVal;
            }
            else if(sign == '*')
            {
                preVal = preVal*currVal;
            }
            else if(sign == '/')
            {
                preVal = preVal/currVal;
            }
            if(i<len )
            {
                sign = s.charAt(i);
                i++;
            }
        }
        return (int)(res+preVal); 
        
    }
}