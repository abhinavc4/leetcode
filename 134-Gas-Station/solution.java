public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length!=cost.length)
        {
            return -1;
        }
        int total = 0;
        int sumRem = 0;
        int start = 0;
        for(int i = 0 ; i < gas.length;i++)
        {
            if(sumRem>=0)
            {
                sumRem+=gas[i] - cost[i];;
            }
            else
            {
                sumRem = gas[i] - cost[i];;
                start = i;
            }
            total+=gas[i] - cost[i];;
        }
        if(total>=0)
        {
            return start;
        }
        return -1;
    }
}