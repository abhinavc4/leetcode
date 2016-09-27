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
    public int countNodes(TreeNode root) {
        int left = countLeftHeight(root);
        int right = countRightHeight(root);
        
        if(left == right)
        {
            return ((1<<left)-1);
        }
        return countNodes(root.left)+countNodes(root.right)+1;
    }
    int countLeftHeight(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        return 1+countLeftHeight(root.left);
    }
    int countRightHeight(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        return 1+countRightHeight(root.right);
    }
}