public class Solution {
    
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");
        
        List<String> l = new ArrayList<String>();
        
        if(digits.length() > 0)
        {
            helper(digits,0,l,new String(),hm);
        }
        return new ArrayList<String>(l);
    }
    void helper(String digits,int index , List<String> l,String str,HashMap<Integer,String> hm)
    {
        if(index >= digits.length())
        {
            l.add(new String(str));
            return;
        }
        String s = hm.get(digits.charAt(index)-'0');
        for(int j = 0 ; j < s.length();j++)
        {
            helper(digits,index+1,l,str+ s.charAt(j),hm);
        }
    }
}