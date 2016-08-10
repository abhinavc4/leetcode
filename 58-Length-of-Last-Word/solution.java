public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        String[] sArr = s.split(" ");
        if(sArr.length == 0)
        {
            return 0;
        }
        return sArr[sArr.length-1].length();
    }
}