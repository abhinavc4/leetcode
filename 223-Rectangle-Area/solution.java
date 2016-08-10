public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        
        int area = 0;
        int len1 = (int)Math.abs(C-A);
        int wid1 = (int)Math.abs(D-B);
        
        int len2 = (int)Math.abs(G-E);
        int wid2 = (int)Math.abs(H-F);
        
        int area1 = len1*wid1;
        int area2 = len2*wid2;
        
        area += area1;
        area += area2;
        if(isIntersect(A,B,len1,wid1,E,F,len2,wid2))
        {
            int tempArea = 0 ;
            int x1 = Math.max(A,E);
            int x2 = Math.min(A+len1,E+len2);
            int y1 = Math.max(B,F);
            int y2 = Math.min(B+wid1,F+wid2);
            tempArea = Math.abs((x2-x1)*(y2-y1));
            area-=tempArea;
        }
        return area;
           
        
    }
    boolean isIntersect(int A , int B , int len1 , int wid1, int E , int F , int len2 , int wid2)
    {
        if((E<=(A+len1))&&
           (A<=(E+len2))&&
           (F<=(B+wid1))&&
           (B<=(F+wid2))
        )
        {
            return true;
        }
        return false;
    }
}