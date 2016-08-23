public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<tuple> pq = new PriorityQueue<tuple>();
        int len = matrix.length;
        for(int i = 0 ;i<len;i++)
        {
            pq.add(new tuple(0,i,matrix[0][i]));                
        }
        for(int j = 0 ; j <k-1 ; j++ )
        {
            tuple value = pq.poll();
            if(value.row == len-1)
            {
               continue;
            }
            pq.add(new tuple(value.row+1,value.col,matrix[value.row+1][value.col]));
        }
        if(pq.size()!=0)
        {
            return pq.poll().element;    
        }
        return 0;
    }
    
    public class tuple implements Comparable<tuple>
    {
        int row;
        int col;
        int element;
        
        public tuple(int row,int col,int element)
        {
            this.row = row;
            this.col = col;
            this.element = element;
        }
        
        public int compareTo(tuple b)
        {
            if(0 == Integer.compare(this.element,b.element))
            {
                return Integer.compare(this.col,b.col);
            }
            return Integer.compare(this.element,b.element);
        }
    }
}