public class Solution {
    public String getHint(String secret, String guess) {
        int len = secret.length();
        int[] a = new int[10];
        Arrays.fill(a,0);
        for(int i = 0 ; i < len ; i++)
        {
            int place = secret.charAt(i)-'0';
            a[place]++;
        }
        int A = 0 ; int B = 0 ;
        for(int i = 0 ; i < len ; i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
            {
                if(a[guess.charAt(i)-'0']>0)
                {
                    a[secret.charAt(i)-'0']--;
                    
                }
                else
                {
                    B--;
                }
                A++;
            }
            else if(a[guess.charAt(i)-'0']>0)
            {
                a[guess.charAt(i)-'0']--;
                B++;
            }
        }
        return A+"A"+B+"B";
    }
}