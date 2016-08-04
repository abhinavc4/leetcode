public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> hs = new HashSet<Integer>();
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0 ; i < nums1.length;i++)
        {
            hs.add(nums1[i]);
        }
        
        for(int i = 0 ; i < nums2.length;i++)
        {
            if(hs.contains(nums2[i]))
            {
                hs.remove(nums2[i]);
                al.add(nums2[i]);
            }
        }
        int arr[] = new int[al.size()];
        for(int i = 0 ; i < arr.length;i++)
        {
            arr[i] = al.get(i).intValue();
        }
        return arr;
    }
}