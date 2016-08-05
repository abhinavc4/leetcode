public class Solution {
    
    public int romanToInt(String s) {
        if(s.length() == 0 )
        {
            return 0;
        }
        HashMap<Integer,Integer> hm  = new HashMap<Integer,Integer>();
        String str = "ivxlcdm";
        int[] arr = new int[]{1,5,10,50,100,500,1000};
        for(int i = 0 ; i < arr.length;i++)
        {
            hm.put(str.charAt(i)-'a',arr[i]);
        }
        s = s.toLowerCase();
        
        int prev = hm.get(s.charAt(0) - 'a'); 
        int sum = prev;
        
        for(int i = 1 ; i < s.length();i++)
        {
            int value = hm.get(s.charAt(i) - 'a'); 
            if(value <= prev)
            {
                sum+=value;
            }
            else
            {
                sum +=(value-2*prev);
            }
            prev = value;
        }
        return sum;
    }
}