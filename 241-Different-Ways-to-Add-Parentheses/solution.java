public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        HashMap<String , List<Integer>> cache = new HashMap<String , List<Integer>>();
        return helper(input,cache);
    }
    
    List<Integer> helper(String s , HashMap<String , List<Integer>> cache)
    {
        if(null!=cache.get(s))
        {
            return cache.get(s);
        }
        boolean expr = false;
        List<Integer> res = new ArrayList<Integer>();
        for(int i = 0 ; i < s.length();i++)
        {
            if(-1 != "+-*".indexOf(s.charAt(i)))
            {
                List<Integer> left = helper(s.substring(0,i),cache);
                List<Integer> right = helper(s.substring(i+1,s.length()),cache);
                for(Integer a : left)
                {
                    for(Integer b : right)
                    {
                        res.add(cal(a,b,s.charAt(i)));
                    }
                }
                expr = true;
            }
        }
        if(!expr)
        {
           res.add(Integer.parseInt(s));
        }
        cache.put(s,res); 
        return res;
    }
    
    int cal(Integer one , Integer two , char op)
    {
        int val = 0;
        switch(op)
        {
            case '+' : val = one + two;
            break;
            
            case '-' : val = one - two;
            break;
            
            case '*' : val = one * two;
            break;
        }
        return val;
    }
}