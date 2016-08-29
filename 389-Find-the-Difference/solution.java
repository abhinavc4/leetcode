public class Solution {
    public char findTheDifference(String s, String t) {
        char val = 0;
        for(int i = 0  ;i < t.length()-1 ; i++)
        {
            val = (char)(val^(s.charAt(i))^(t.charAt(i)));
        }
        val = (char)(val^t.charAt(t.length()-1));
        return val;
    }
}