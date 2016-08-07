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
    class TreeWithCount
    {
        TreeNode root ;
        int count;
        public TreeWithCount(TreeNode root,int count)
        {
            this.root = root;
            this.count =count;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
        {
            return root;
        }
        TreeWithCount custTreeNode = lcaHelper(root,p,q);
        return custTreeNode.root;
    }
    public TreeWithCount lcaHelper(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
        {
            return new TreeWithCount(root,0);
        }
        TreeWithCount left = lcaHelper(root.left,p,q);
        if(left.count ==2)
        {
            return left;
        }
        TreeWithCount right = lcaHelper(root.right,p,q);
        if(right.count ==2)
        {
            return right;
        }
        int val = (root == p)?1:0;
        val+=(root == q)?1:0;
        int count = left.count + right.count + val;
        return new TreeWithCount(root,count);
}
}