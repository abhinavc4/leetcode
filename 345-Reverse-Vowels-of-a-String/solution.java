public class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] chArr = s.toCharArray();
        int i = 0 ; 
        int j = chArr.length-1;
        while(i<j)
        {
            while(i<j && -1==vowels.indexOf(chArr[i]))
            {
                i++;
            }
            while(i<j && -1==vowels.indexOf(chArr[j]))
            {
                j--;
            }
            swap(chArr,i,j);
            i++;
            j--;
        }
        return new String(chArr);
    }
    void swap(char[] arr, int i , int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}