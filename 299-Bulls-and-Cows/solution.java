public class Solution {
    public String getHint(String secret, String guess) {
        int len = secret.length();
        int[] a = new int[10];
        Arrays.fill(a,0);
        int A = 0 ; int B = 0;
        for(int i = 0 ; i < len ; i ++)
        {
            int s = secret.charAt(i)-'0';
            int g = guess.charAt(i)-'0';
            if(s==g)
            {
                A++;
            }
            else
            {
                if(a[s]<0)
                {
                    B++;
                }
                if(a[g]>0)
                {
                    B++;
                }
                a[s]++;
                a[g]--;
            }
        }
        return A+"A"+B+"B";
    }
}