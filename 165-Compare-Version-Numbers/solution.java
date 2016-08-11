public class Solution {
    public int compareVersion(String version1, String version2) {
        String [] arr1 = version1.split("\\.");
        String [] arr2 = version2.split("\\.");
        
        int len1 = arr1.length;
        int len2 = arr2.length;
        if(len1 == 0 && len2 == 0)
        {
            return 0;
        }
        if(len1 == 0)
        {
            return -1;
        }
        if(len2 == 0)
        {
            return 1;
        }
        int itLen = Math.min(len1,len2);
        for(int i = 0 ; i < itLen ; i++)
        {
            System.out.println(Integer.parseInt(arr1[i])+" "+Integer.parseInt(arr2[i]));
            int value = Integer.compare(Integer.parseInt(arr1[i]),Integer.parseInt(arr2[i]));
            if(value !=0)
            {
                return value;
            }
        }
        if(len1==len2)
        {
            return 0;
        }
        
        if(len1<len2)
        {
            for(int i = len1 ; i<len2 ; i++)
            {
                if(Integer.parseInt(arr2[i])!=0)
                {
                    return -1;
                }
            }
            return 0;
        }
        else
        {
            for(int i = len2 ; i<len1 ; i++)
            {
                if(Integer.parseInt(arr1[i])!=0)
                {
                    return 1;
                }
            }
            return 0;
        }
        
    }
}