public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int min = Integer.MAX_VALUE;
        int dist1 = Integer.MAX_VALUE;
        int dist2 = Integer.MAX_VALUE;
        for(int i = 0 ; i < words.length ; i++)
        {
            if(words[i].equals(word1))
            {
                dist1 = i;
                min = Math.min(min,Math.abs(dist1-dist2));
            }
            else if(words[i].equals(word2))
            {
                dist2 = i;
                min = Math.min(min,(int)Math.abs(dist1-dist2));
            }
        }
        return min;
    }
}