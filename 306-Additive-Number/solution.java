public class Solution {
        /*Choose the first number A, it can be the leftmost 1 up to i digits. i<=(L-1)/2 because the third number should be at least as long as the first number

        Choose the second number B, it can be the leftmost 1 up to j digits excluding the first number. the limit for j is a little bit tricky, because we don't know whether A or B is longer. The remaining string (with length L-j) after excluding A and B should have a length of at least max(length A, length B), where length A = i and length B = j-i, thus L-j >= max(j-i, i)

        Calls the recursive checker function and returns true if passes the checker function, or continue to the next choice of B (A) until there is no more choice for B or A, in which case returns a false.*/
    public boolean isAdditiveNumber(String num) {
        int L = num.length();
        for(int i = 1 ; i <=(L-1)/2;i++ )
        {
            if(num.charAt(0)=='0' && i>=2)
            {
                break;
            }
            for(int j = i+1;L-j>=i && L-j>=j-i ; j++)
            {
                if(num.charAt(i)=='0' && j-i>=2)
                {
                    break;
                }
                Long s1 = Long.parseLong(num.substring(0,i));
                Long s2 = Long.parseLong(num.substring(i,j));
                String str = num.substring(j);
                if(isAdditive(str,s1,s2))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isAdditive(String str , Long s1 , Long s2)
    {
        if(str.equals(""))
        {
            return true;
        }
        
        Long sum = s1+s2;
        String sumStr = ((Long)sum).toString();
        if(!str.startsWith(sumStr))
        {
            return false;
        }
        return isAdditive(str.substring(sumStr.length()),s2,sum);
    }
}