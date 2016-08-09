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
    class HT
    {
        int height ;
        boolean isBal ;
        HT(int h , boolean f)
        {
            height = h;
            isBal = f;
        }
    }
    HT isBal(TreeNode root)
    {
        if(root == null)
        {
            return new HT(0,true);
        }
        HT left = isBal(root.left);
        if(!left.isBal)
        {
            return left;
        }
        HT right = isBal(root.right);
        if(!right.isBal)
        {
            return right;
        }
        if(1<Math.abs(left.height-right.height))
        {
            return new HT(0,false);
        }
        int height = Math.max(left.height,right.height)+1;
        return new HT(height,true);
        
    }
    public boolean isBalanced(TreeNode root) {
        return isBal(root).isBal;
    }
}