/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    TreeNode helper(int[] nums,int begin,int end)
    {
        if(nums.length == 0)
        {
            return null;
        }
        if(begin == end)
        {
            return new TreeNode(nums[begin]);
        }
        if(begin>end)
        {
            return null;
        }
        int mid = begin + (end-begin)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,begin,mid-1);
        root.right = helper(nums,mid+1,end);
        return root;
    }
}