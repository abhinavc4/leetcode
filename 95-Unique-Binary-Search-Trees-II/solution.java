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
    public List<TreeNode> generateTrees(int n) {
        if(n==0)
        {
            return new LinkedList<TreeNode>();
        }
        return generate(1,n);
    }
    
    public List<TreeNode> generate(int begin,int end) {
        List<TreeNode> res = new LinkedList<TreeNode>();
        
        if(begin>end)
        {
            res.add(null);
            return res;
        }
        
        for(int i = begin ; i <= end ; i++)
        {
            List<TreeNode> left  = generate(begin,i-1);
            List<TreeNode> right = generate(i+1,end);
            for(TreeNode l : left)
            {
                for(TreeNode r:right)
                {
                    TreeNode curr = new TreeNode(i);
                    curr.left = l;
                    curr.right = r;
                    res.add(curr);
                }
            }
        }
        return res;
    }
}