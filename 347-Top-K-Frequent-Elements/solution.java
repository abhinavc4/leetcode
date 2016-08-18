public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> l = new ArrayList<Integer>();
        int len = nums.length;
        if(k == 0 || len == 0)
        {
            return l;    
        }
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        TreeMap<Integer,TreeSet<Integer>> tm = new TreeMap<Integer,TreeSet<Integer>>();
        for(int i : nums)
        {
            Integer count = hm.get(i);
            if(count!=null)
            {
                TreeSet<Integer> al = tm.get(count);
                hm.put(i, count+1);
                if(al == null)
                {
                    al = new TreeSet<Integer>();
                    al.add(i);
                    tm.put(count,al);
                }
                else
                {
                    al.remove(new Integer(i));
                    if(al.size()==0)
                    {
                        tm.remove(count);
                    }
                    else
                    {
                        tm.put(count,al);
                    }
                    TreeSet<Integer> alNew = tm.get(count+1);
                    if(alNew == null)
                    {
                        alNew = new TreeSet<Integer>();
                    }
                    alNew.add(i);
                    tm.put(count+1,alNew);
                }
            }
            else
            {
                count = new Integer(0);
                hm.put(i,count);
                TreeSet<Integer> al = tm.get(count);
                if(al == null)
                {
                    al = new TreeSet<Integer>();
                }
                al.add(i);
                tm.put(count,al);
                
            }
        }
        int numRem = k;
        while(numRem>0)
        {
            TreeSet<Integer> temp = (tm.pollLastEntry()).getValue();
            numRem-=temp.size();
            if(l.size()<k)
            {
                l.addAll(temp);
            }
            while(l.size()>k)
            {
                l.remove(l.size()-1);
            }
        }
        return l;
    }
}