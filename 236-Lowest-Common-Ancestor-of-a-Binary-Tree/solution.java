/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class some
{
    TreeNode root;
    int count;
    some(TreeNode root,int count)
    {
        this.root = root;
        this.count = count;
    }
}
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return helper(root,p,q).root;
    }
    some helper(TreeNode root, TreeNode p, TreeNode q)
    {
        if(root == null)
        {
            return new some(null,0);
        }
        
        some left = helper(root.left,p,q);
        if(left.root!=null)
        {
            return left;
        }
        some right = helper(root.right,p,q);
        if(right.root!=null)
        {
            return right;
        }
        int count = 0;
        if(root == p)
        {
            count++;
        }
        if(root == q)
        {
            count++;
        }
        count += left.count+right.count;
        if(count>=2)
        {
            return new some(root,2);
        }
        return new some(null,count);
    }
}