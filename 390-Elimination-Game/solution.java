public class Solution {
    public int lastRemaining(int n) {
        int step  = 1;
        int rem = n;
        int head = 1;
        boolean left = true;
        while(rem>1)
        {
            if(left || rem%2==1)
            {
                head = head+step;
            }
            rem = rem/2;
            step = step*2;
            left = !left;
        }
        return head;
    }
}