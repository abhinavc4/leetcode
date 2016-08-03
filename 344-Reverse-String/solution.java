public class Solution {
    public String reverseString(String s) {
        int strLength = s.length();
        if(strLength < 2)
        {
            return s;
        }
        char[] chArray = s.toCharArray();
        for(int i = 0 ; i < strLength/2;++i)
        {
            //Collections.swap(Arrays.asList(chArray),i,strLength-1-i);
            swap(chArray,i,strLength-1-i);
        }
        return new String(chArray);
    }
    public void swap(char [] array,int i ,int j)
    {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}