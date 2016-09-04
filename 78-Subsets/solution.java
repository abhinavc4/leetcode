public class Solution {
    double log2 = Math.log(2);
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        for(int i = 0 ; i<(1<<nums.length);i++)
        {
            int bitSet = i;
            List<Integer> al = new ArrayList<Integer>();
            while(bitSet!=0)
            {
                al.add(nums[(int)(Math.log(bitSet&~(bitSet-1))/log2)]);
                bitSet&=(bitSet-1);
            }
            l.add(new ArrayList<Integer>(al));
        }
        return l;
    }
}