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
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        if(null!=root)
        {
            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(root.val);
            helper(root,sum-root.val,l,al);
        }
        return l;
    }
    
    void helper(TreeNode root , int sum , List<List<Integer>> l,List<Integer> al)
    {
        if(root.right==null && root.left == null && sum == 0)
        {
                l.add(new ArrayList<Integer>(al));
                return;
        }
        if(root.left!=null)
        {
            al.add(root.left.val);
            helper(root.left  , sum-root.left.val , l , al);
            al.remove(al.size()-1);
        }
        if(root.right!=null)
        {
            al.add(root.right.val);
            helper(root.right , sum-root.right.val , l , al);
            al.remove(al.size()-1);
        }
        
    }
}