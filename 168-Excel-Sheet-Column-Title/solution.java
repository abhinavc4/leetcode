public class Solution {
    public String convertToTitle(int n) {
        StringBuilder s = new StringBuilder();
        if(n<=0)
        {
            return s.toString();
        }
        
        while(n>0)
        {
            n--;
            s.insert(0,(char)('A'+(n%26)));
            n=n/26;
        }
        return s.toString();
        
    }
}