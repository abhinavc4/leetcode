public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int a : nums1)
        {
            Integer count = hm.get(a);
            if(count == null)
            {
                count = 0;
            }
            hm.put(a,count+1);
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int a : nums2)
        {
            Integer count = hm.get(a);
            if(count!=null)
            {
                al.add(a);
                count = count-1;
                if(count ==0 )
                {
                    hm.remove(a);
                }
                else
                {
                    hm.put(a,count);
                }
            }
        }
        int returnArray[] = new int[al.size()];
        int i = 0 ;
        for(int a : al)
        {
            returnArray[i++] = a;
        }
        return returnArray;
    }
}