public class Solution {
    public String convertToTitle(int n) {
        StringBuilder s = new StringBuilder();
        if(n<=0)
        {
            return s.toString();
        }
        int c = 0;
        while(n>0)
        {
            int temp = n/(int)Math.pow(26,c);
            int ch = temp%26;
            if(ch ==0)
            {
                ch = 26;
            }
            s.insert(0,(char)('A'+ch-1));
            int sub = 0;
            if(c == 0)
            {
                sub = ch;
            }
            else
            {
                sub = (int)Math.pow(26,c)*ch;
            }
            c++;
            n = n-sub;
        }
        return s.toString();
        
    }
}