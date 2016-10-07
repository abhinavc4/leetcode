public class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for(char c : s.toCharArray())
        {
            if(hs.contains(c))
            {
                hs.remove(c);
                count++;
            }
            else
            {
                hs.add(c);
            }
        }
        return 2*count + (hs.isEmpty()?0:1);
    }
}