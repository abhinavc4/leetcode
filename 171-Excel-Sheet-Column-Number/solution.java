public class Solution {
    public int titleToNumber(String s) {
        int len = s.length();
        //s = s.toLowerCase();
        int ret = 0;
        char[] chArr = s.toCharArray();
        for(int i = 0 ; i < len ;i++)
        {
            ret= ret*26 + chArr[i]-'A' + 1;
        }
        return ret;
    }
}