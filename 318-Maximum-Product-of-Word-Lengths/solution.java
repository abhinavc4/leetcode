public class Solution {
    public int maxProduct(String[] words) {
        int len = words.length;
        if(len==0||len==1)
        {
            return 0;
        }
        int[] value = new int[len];
        for(int i = 0 ; i < len ; i++)
        {
            String temp = words[i];
            value[i] = 0;
            for(int j = 0 ; j < temp.length() ; j++)
            {
                value[i] |= 1<<temp.charAt(j)-'a';
            }
        }
        int maxProd = 0;
        for(int i=0 ; i<len ; i++)
        {
            for(int j=i+1 ;j<len;j++)
            {
                if(((value[i]&value[j])==0)&&((words[i].length()*words[j].length())>maxProd))
                {
                    maxProd = words[i].length()*words[j].length();
                }
            }
        }
        return maxProd;
    }
}