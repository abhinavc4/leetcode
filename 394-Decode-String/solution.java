public class Solution {
    public String decodeString(String s) {
        StringBuilder sNew = new StringBuilder();
        int currCount = 0;
        boolean var = false;
        Deque<Integer> stOne = new LinkedList<Integer>();
        Deque<String> stTwo = new LinkedList<String>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                sNew.append(s.charAt(i));
            }
            else if(s.charAt(i)=='[')
            {
                stOne.addFirst(currCount);
                stTwo.addFirst(sNew.toString());
                sNew.setLength(0);
                currCount = 0;
            }
            else if(s.charAt(i)==']')
            {
                StringBuilder tmp = sNew;
                sNew = new StringBuilder(stTwo.removeFirst());
                for(int k = stOne.pop();k>0;k--)
                {
                    sNew.append(tmp);
                }
            }
            else if(Character.isDigit(s.charAt(i)))
            {
                currCount= currCount*10 + s.charAt(i)-'0';
            }
        }
        return sNew.toString();
    }
}