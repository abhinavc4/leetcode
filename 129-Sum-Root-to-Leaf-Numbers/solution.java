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
    public int sumNumbers(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        
        helper(root,l,0);
        int val = 0;
        for(Integer i : l)
        {
            val += i;
        }
        return val;
    }
    void helper(TreeNode root ,List<Integer> l,int val)
    {
        if(root == null)
        {
            return;
        }
        if(root.left == null && root.right == null)
        {
            l.add(new Integer(val*10+root.val));
            return;
        }
        helper(root.left,l,val*10+root.val);
        helper(root.right,l,val*10+root.val);
    }
}