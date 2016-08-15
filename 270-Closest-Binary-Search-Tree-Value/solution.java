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
    public int closestValue(TreeNode root, double target) {
        TreeNode temp = root;
        int min = temp.val;
        if(temp.left == null && temp.right == null)
        {
            return temp.val;
        }
        while(temp!=null)
        {
            if(Math.abs(target-temp.val)<Math.abs(target-min))
            {
                min = temp.val;
            }
            if(target > temp.val)
            {
                temp = temp.right;
            }
            else
            {
                temp = temp.left;
            }
        }
        return min;
    }
}