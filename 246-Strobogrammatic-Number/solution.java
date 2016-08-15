public class Solution {
    public boolean isStrobogrammatic(String num) {
        int len = num.length();
        if(len == 0)
        {
            return true;
        }
        char[] ch = num.toCharArray();
        int start = 0;
        int last= len -1;
        while(start<=last)
        {
            if((ch[start] == '1' && ch[last]== '1')
            || (ch[start] == '8' && ch[last]== '8')
            //|| (ch[start] == '3' && ch[last]== '3')
            || (ch[start] == '0' && ch[last]== '0')
            || (ch[start] == '6' && ch[last]== '9')
            || (ch[start] == '9' && ch[last]== '6'))
            {
                start++;
                last--;
            }
            else
            {
                return false;
            }
            
        }
        return true;
    }
}