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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        Queue <TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int size = q.size();
        while(!q.isEmpty())
        {
            TreeNode curr = q.remove();
            if(curr!=null)
            {
                q.add(curr.left);
                q.add(curr.right);
                al.add(curr.val);
            }
            else
            {
                al.add(null);
            }
            size--;
            if(size == 0)
            {
                size = q.size();
                if(isSym(al))
                {
                    al.clear();
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    boolean isSym(ArrayList<Integer> al )
    {
        int i = 0 ; int j = al.size()-1;
        while(i<j)
        {
            if(al.get(i) == al.get(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        
        return true;
    }
}