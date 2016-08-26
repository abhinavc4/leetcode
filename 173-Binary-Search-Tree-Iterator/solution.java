/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {

    Deque<TreeNode> st = null;
    public BSTIterator(TreeNode root) {
        st = new LinkedList<TreeNode>();
        addLeft(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !st.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode valToReturn = st.removeFirst();
        if(valToReturn.right!=null)
        {
            addLeft(valToReturn.right);
        }
        return valToReturn.val;
    }
    
    public void addLeft(TreeNode root)
    {
        TreeNode p = root;
        while(p!=null)
        {
            st.addFirst(p);
            p = p.left;
        }
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */