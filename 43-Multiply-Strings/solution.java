public class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int []pos = new int[len1+len2];
        for(int i = len1-1;i>=0;i--)
        {
            for(int j = len2-1;j>=0;j--)
            {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0') ;
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = product + pos[p2];
                pos[p2] = sum%10;
                pos[p1] += sum/10;
            }
        }
        StringBuilder s = new StringBuilder();
        for(int p : pos)
        {
            if(!(p==0 && s.length()==0))
            {
                s.append(p);
            }
        }
        return s.length()==0?"0":s.toString();
    }
}