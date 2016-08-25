public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<String>();
        helper(l,"",n,n);
        return l;
    }
    void helper(List<String> l ,String s, int numLeft,int numRight)
    {
        if(numLeft==0 && numRight ==0)
        {
            l.add(new String(s));
            return;
        }
        if(numLeft>0)
        {
            helper(l,s+"(",numLeft-1,numRight);
        }
        if(numRight>numLeft)
        {
            helper(l,s+")",numLeft,numRight-1);
        }
    }
}