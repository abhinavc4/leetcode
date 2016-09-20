public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] array = new int[numCourses];
        for(int i = 0 ; i < prerequisites.length ; i++)
        {
            array[prerequisites[i][1]]++;
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0 ; i < array.length ; i++)
        {
            if(array[i]==0)
            {
                q.add(i);
            }
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(!q.isEmpty())
        {
            Integer curr = q.remove();
            if(curr!=null)
            {
                al.add(0,curr);
            }
            for(int i = 0 ; i < prerequisites.length;i++)
            {
                if(prerequisites[i][0]==curr&&array[prerequisites[i][1]]>0)
                {
                    array[prerequisites[i][1]]--;
                    if(array[prerequisites[i][1]]==0)
                    {
                        q.add(prerequisites[i][1]);
                    }
                }
            }
        }
        if(al.size()<numCourses)
        {
            return new int[0];
        }
        int[] retValue = new int[numCourses];
        for(int i = 0 ; i < al.size();i++)
        {
            retValue[i]=al.get(i);
        }
        return retValue;
    }
}