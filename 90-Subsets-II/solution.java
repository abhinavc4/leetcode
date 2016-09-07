public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        double  log2 = Math.log(2);
        Arrays.sort(nums);
        HashSet<List<Integer>> al = new HashSet<List<Integer>>();
        for(int i = 0 ; i  < (1<<nums.length) ; i++)
        {
            int bitSet = i;
            List<Integer> temp = new ArrayList<Integer>();
            while(bitSet != 0)
            {
                temp.add(nums[(int)(Math.log(bitSet&~(bitSet-1))/log2)]);
                bitSet&=bitSet-1;
            }
            al.add(temp);
        }
        return new ArrayList<List<Integer>>(al);
    }
}