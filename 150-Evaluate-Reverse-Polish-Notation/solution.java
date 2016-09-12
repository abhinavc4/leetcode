public class Solution {
    boolean checkIsDigit(String str)
    {
        String operators = "+-*/";
        for(int i = 0 ; i < str.length() ; i++)
        {
            if((!Character.isDigit(str.charAt(i)))||-1==operators.indexOf(str.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
    public int evalRPN(String[] tokens) {
        Deque<String> stack = new LinkedList<String>();
        String operators = "+-*/";
        for(String str:tokens)
        {
            str = str.trim();
            if(str.length()==1 && operators.indexOf(str)!=-1)
            {
                Integer two = Integer.parseInt(stack.removeFirst());
                Integer one = Integer.parseInt(stack.removeFirst());
                int val = operators.indexOf(str);
                int result=0;
                switch(val)
                {
                    case 0:result = two +one;
                           break;
                    case 1: result = one-two;
                           break;
                    case 2: result = one*two;
                            break;
                    case  3: result= one/two;
                            break;
                }
                stack.addFirst(String.valueOf(result));
            }
            else 
            {
                try
                {
                    Integer ab = Integer.parseInt(str);
                    stack.addFirst(str);
                }
                catch(Exception e)
                {
                    System.out.println(str);
                }
            }
        }
        return Integer.parseInt(stack.removeFirst());
    }
}