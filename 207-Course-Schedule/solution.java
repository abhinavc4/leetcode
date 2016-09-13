public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] visit = new int[numCourses];
        HashMap<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
        int len = prerequisites.length;
        if(numCourses == 0 || len==0)
        {
            return true;
        }
        for(int []a : prerequisites)
        {
            if(map.containsKey(a[1]))
            {
                map.get(a[1]).add(a[0]);
            }
            else
            {
                ArrayList<Integer> al = new ArrayList<Integer>();
                al.add(a[0]);
                map.put(a[1],al);
            }
        }
        
        for(int i = 0 ; i < numCourses ;i++)
        {
            if(!properFin(i,map,visit))
            {
                return false;
            }
        }
        return true;
    }
    
    boolean properFin(int i ,HashMap<Integer,List<Integer>> map ,int[] visit)
    {
        if(visit[i] == -1)
        {
            return false;
        }
        if(visit[i] == 1)
        {
            return true;
        }
        visit[i] = -1;
        if(map.containsKey(i))
        {
            for(int j : map.get(i))
            {
                if(!properFin(j,map,visit))
                {
                    return false;
                }
            }
        }
        visit[i] = 1;
        return true;
    }
}