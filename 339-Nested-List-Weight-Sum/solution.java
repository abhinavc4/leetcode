/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {
    public int depthSum(List<NestedInteger> nestedList) {
        if(nestedList.size()>0)
        {
            return dSum(nestedList,1);
        }
        return 0;
    }
    public int dSum(List<NestedInteger> nestedList,int currDepth)
    {
        if(nestedList.size()==0)
        {
            return 0;
        }
        int sum = 0;
        for(NestedInteger a : nestedList)
        {
            if(a.isInteger())
            {
                sum+=a.getInteger()*currDepth;
            }
            else
            {
                sum += dSum(a.getList(),currDepth+1);
            }
        }
        return sum;
    }
}