public class Solution {
    public int numDecodings(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        int n = s.length();
        int[] arr = new int[s.length()+1];
        arr[0] = 1;
        arr[1] = s.charAt(0)!='0' ? 1 : 0;
        for(int i = 2; i <= s.length() ; i++)
        {
            int first = Integer.parseInt(s.substring(i-1,i));
            
            int second = Integer.parseInt(s.substring(i-2,i));
            
            if(first>=1&&first<=9)
            {
                arr[i]+=arr[i-1];
            }
            if(second>=10&&second<=26)
            {
                arr[i]+=arr[i-2];
            }
        }
        return arr[n];
    }
}