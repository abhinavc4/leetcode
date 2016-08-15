public class Solution {
    public boolean canPermutePalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        char[] ch = s.toCharArray();
        int len = ch.length;
        if(len == 0 || len ==1 )
        {
            return true;
        }
        int result = 0;
        for(char c : ch)
        {
            Integer count = hm.get(c);
            if(count == null)
            {
                count = 0;
            }
            count = count+1;
            if(count%2==1)
            {
                result++;
            }
            else
            {
                result--;
            }
            hm.put(c,count);
        }
        return (result<=1);
    }
}