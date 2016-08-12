public class Solution {
    public void rotate(int[] nums, int k) {
        int count = nums.length;
        k = k%count;
        for(int start = 0 ;count>0 ;start++)
        {
            int current = start;
            int prev = nums[start];
            do
            {
                int next = (start+k)%nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                start = next;
                count--;       
            }while(current!=start);
        }
        return;
    }
}
