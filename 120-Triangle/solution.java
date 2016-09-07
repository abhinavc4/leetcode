public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        if(size == 0)
        {
            return 0;
        }
        if(size == 1)
        {
            return triangle.get(0).get(0);
        }
        int[] dp = new int[triangle.size()];
        for(int i = 0 ; i  < size ; i++)
        {
            dp[i] = triangle.get(size-1).get(i);
        }
        
        for(int i = size-2 ; i >=0  ;i--)
        {
            for(int j = 0 ; j < triangle.get(i).size(); j++)
            {
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j],dp[j+1]);
            }
        }
        return dp[0];
    }
}