public class Solution {
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        HashMap<String,HashMap<String,Double>> mp = new HashMap<>();
        int i = 0 ;
        for(String [] arr : equations)
        {
            insertValue(arr[0],arr[1],mp,values[i]);
            insertValue(arr[1],arr[0],mp,1/values[i]);
            i++;
        }
        
        i = 0;
        double[] res = new double[queries.length];
        for(String[] a : queries)
        {
            Double val =  handleQuery(a[0],a[1],mp,new HashSet<String>());
            res[i++] = val==null?-1.0:val;
        }
        return res;
        
    }
    
    public Double handleQuery(String num , String denom , HashMap<String,HashMap<String,Double>> mp,HashSet<String> contain)
    {
        String dupe = num + ":" + denom;
        if(!mp.containsKey(num)||!mp.containsKey(denom)) return null;
        if(contain.contains(dupe)) return null;
        if(num.equals(denom)) return 1.0;
        
        contain.add(dupe);
        HashMap<String,Double> denomMap = mp.get(num);
        for(String val : denomMap.keySet())
        {
            Double res = handleQuery(val,denom,mp,contain);
            if(res!=null)
            {
                return denomMap.get(val)*res;
            }
        }
        contain.remove(dupe);
        return null;
    }
    
    public void insertValue(String num , String denom , HashMap<String,HashMap<String,Double>> mp,double value)
    {
        HashMap<String,Double> denomMap = mp.get(num);
        if(denomMap==null)
        {
            denomMap = new HashMap<String,Double>();
            mp.put(num,denomMap);
        }
        denomMap.put(denom,value);
    }
}