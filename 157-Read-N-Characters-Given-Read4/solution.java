/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
        int index = 0;
        if(n<=0)
        {
            return 0;
        }
        int len = buf.length;
        char[] a = new char[4];
        int numOfCharsRead = 4;
        for(index = 0; index<n && numOfCharsRead == 4 ;)
        {
            numOfCharsRead = read4(a);
            int i = 0 ;
            while(i < numOfCharsRead && index < n)
            {
                buf[index++] = a[i++];    
            }
        }
        return index;
    }
}