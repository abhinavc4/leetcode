public class Solution {
    public int myAtoi(String str) {
        long sum = 0;
        str = str.trim();
        int len = str.length();
        if(len == 0)
        {
            return 0;
        }
        if(len == 1)
        {
            if(Character.isDigit(str.charAt(0)))
            {
                return str.charAt(0)-'0';
            }
            return 0;
        }
        char[] chArray = str.toCharArray();
        boolean isNegative = false;
        int startIndex = 0;
        if(chArray[0]=='-')
        {
            isNegative = true;
            startIndex++;
        }
        if(chArray[0]=='+')
        {
            startIndex++;
        }
        while(startIndex < len && chArray[startIndex]=='0')
        {
            startIndex++;
        }
        for(int i = startIndex ; i < len && sum < Integer.MAX_VALUE ; i++)
        {
            int value = chArray[i]-'0';
            if(value>=0 && value <= 9)
            {
                sum = sum*10+value;
            }
            else
            {
                break;
            }
        }
        if(isNegative)
        {
            sum = sum*-1;
        }
        if(sum>Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        if(sum < Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }
        return (int)sum;
        
        
    }

    
}