public class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<Character>();
        int len = s.length();
        if(len ==0)
        {
            return true;
        }
        if(len == 1)
        {
            return false;
        }
        String open = "({[";
        for(int i = 0 ; i < len ; i++)
        {
            char ch = s.charAt(i);
            if(-1 != open.indexOf(ch))
            {
                stack.addFirst(ch);
            }
            else 
            {
                if(stack.size()==0)
                {
                    return false;
                }
                char chS = stack.peekFirst();
                if((ch == ')' && chS == '(') ||
                   (ch == '}' && chS == '{') ||
                   (ch == ']' && chS == '[') )
                {
                   stack.removeFirst(); 
                }
                else
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}