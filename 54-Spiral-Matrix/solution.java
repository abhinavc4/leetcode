public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        
        List<Integer> spiralOrdering = new ArrayList<Integer>();
        if(matrix.length==0)
        {
            return spiralOrdering;
        }
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length-1;
        while(rowBegin <= rowEnd && colBegin <= colEnd)
        {
            for(int j = colBegin ; j <= colEnd ; j++)
            {
                spiralOrdering.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            
            for(int j = rowBegin ; j <= rowEnd ; j++)
            {
                spiralOrdering.add(matrix[j][colEnd]);
            }
            colEnd--;
            
            if(rowBegin<=rowEnd)
            {
                for(int j = colEnd ; j >= colBegin ; j--)
                {
                    spiralOrdering.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;

            if(colBegin<=colEnd)
            {
                for(int j = rowEnd ; j >= rowBegin;j--)
                {
                    spiralOrdering.add(matrix[j][colBegin]);
                }
            }
            colBegin++;
            
        }
        return spiralOrdering;
    }
}