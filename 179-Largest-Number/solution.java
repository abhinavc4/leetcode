public class Solution {
    public String largestNumber(int[] nums) {
        String[] str_nums = new String[nums.length];
        for(int i = 0 ; i < nums.length ; i++)
        {
            str_nums[i] = String.valueOf(nums[i]);
        }
        
        Comparator<String> comp = new Comparator<String>()
        {
            public int compare(String s1,String s2)
            {
                String temp1 = s1+s2;
                String temp2 = s2+s1;
                return -1*temp1.compareTo(temp2);
            }
        };
        
        Arrays.sort(str_nums,comp);
        if(str_nums[0].equals("0"))
        {
            return "0";
        }
        StringBuilder strBuilder = new StringBuilder();
        for(String str : str_nums)
        {
            strBuilder.append(str);
        }
        return strBuilder.toString();
    }
}