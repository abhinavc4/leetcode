public class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        HashSet<String> beginList = new HashSet<String>();
        HashSet<String> endList = new HashSet<String>();
        
        HashSet<String> visited = new HashSet<String>();
        beginList.add(beginWord);
        endList.add(endWord);
        int len = 1;
        while(!beginList.isEmpty() && !endList.isEmpty())
        {
            if(beginList.size()>endList.size())
            {
                HashSet<String> temp = beginList;
                beginList = endList;
                endList = temp;
            }
            
            HashSet<String> temp = new HashSet<String>();
            for(String a: beginList )
            {
                char[] aArr = a.toCharArray();
                for(int i = 0 ; i < aArr.length ; i++)
                {
                    for(char c = 'a' ; c <= 'z' ; c++)
                    {
                        char old = aArr[i];
                        aArr[i] = c;
                        String target = String.valueOf(aArr);
                        
                        if(endList.contains(target))
                        {
                            return len+1;
                        }
                        
                        if(!visited.contains(target) && wordList.contains(target))
                        {
                            visited.add(target);
                            temp.add(target);
                        }
                        aArr[i] = old;
                    }
                }
            }
            beginList = temp;
            len++;
        }
     return 0;   
    }
}