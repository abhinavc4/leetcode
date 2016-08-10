/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l = new ArrayList<String>();
        if(root == null)
        {
            return l;
        }
        btPaths(root,new String(),l);
        return l;
    }
    public void btPaths(TreeNode root , String partial , List<String> l)
    {
        if(root.left == null && root.right == null)
        {
            partial+=root.val;
            l.add(new String(partial));
            return ;
        }
        partial+=root.val+"->";
        if(root.left!=null)
        {
            btPaths(root.left,partial,l);
        }
        if(root.right!=null)
        {
            btPaths(root.right,partial,l);
        }
        return;
    }
}