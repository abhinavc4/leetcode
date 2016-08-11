public class NumArray {

    public int [] totalSum = null;
    public int totLen = 0;
    public NumArray(int[] nums) {
        totLen = nums.length;
        totalSum = new int[totLen];
        for(int i = 0 ; i < totLen ; i++)
        {
            int prevSum = i==0?0:totalSum[i-1];
            totalSum[i] = prevSum + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if(i>=0 && j>=i && j<= totLen-1)
        {
            int preSum = i==0?0:totalSum[i-1];
            return totalSum[j]-preSum;
        }
        else
        {
            return 0;
        }
        
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);