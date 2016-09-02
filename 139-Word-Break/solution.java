public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        int[] word = new int[s.length()+1];
        Arrays.fill(word,-1);
        word[0] = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(word[i] == -1)
            {
                continue;
            }
            for(int j = i+1 ; j < word.length ; j++)
            {
                if(wordDict.contains(s.substring(i,j)))
                {
                    word[j] = i;
                }
            }
        }
        return word[s.length()]!=-1;
    }
}