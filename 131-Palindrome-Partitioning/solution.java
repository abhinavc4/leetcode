public class Solution {
        List<String> al;
        List<List<String>> l;
        
    public List<List<String>> partition(String s) {
        al = new ArrayList<String>();
        l = new ArrayList<List<String>>();
        backtrack(s,0);
        return l;
    }
    void backtrack(String s , int i)
    {
        if(al.size()>0 && i>=s.length())
        {
            l.add(new ArrayList<String>(al));
        }
        for(int l = i ; l<s.length();l++)
        {
            if(isPalindrome(s,i,l))
            {
                if(l==i)
                {
                    al.add(Character.toString(s.charAt(i)));
                }
                else
                {
                    al.add(s.substring(i,l+1));
                }
                backtrack(s,l+1);
                al.remove(al.size()-1);
            }
        }
    }
    boolean isPalindrome(String s , int l , int r)
    {
        if(l==r)
        {
            return true;
        }
        while(l<r)
        {
             if(s.charAt(l)!=s.charAt(r))
             {
                 return false;
             }
             l++;
             r--;
        }
        return true;
    }
}