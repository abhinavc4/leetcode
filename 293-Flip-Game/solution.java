public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> l = new ArrayList<String>();
        char[] ch = s.toCharArray();
        int len = ch.length;
        for(int i = 0 ; i < len-1 ; i++)
        {
            if(ch[i]=='+' && ch[i+1]=='+')
            {
                ch[i] = '-';
                ch[i+1] = '-';
                l.add(new String(ch));
                ch[i] = '+';
                ch[i+1] = '+';
            }
        }
        return l;
        
    }
}