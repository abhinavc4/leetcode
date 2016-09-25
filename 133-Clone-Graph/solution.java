/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        HashMap<Integer,UndirectedGraphNode> hm = new HashMap<Integer,UndirectedGraphNode>();
        return clone(node,hm);
    }
    
    UndirectedGraphNode clone(UndirectedGraphNode node,HashMap<Integer,UndirectedGraphNode> hm)
    {
        if(node == null)
        {
            return node;
        }
        
        if(hm.containsKey(node.label))
        {
            return hm.get(node.label);
        }
        
        UndirectedGraphNode temp = new UndirectedGraphNode(node.label);
        hm.put(temp.label,temp);
        for(UndirectedGraphNode neighbour : node.neighbors)
        {
            temp.neighbors.add(clone(neighbour,hm));
        }
        return temp;
    }
}