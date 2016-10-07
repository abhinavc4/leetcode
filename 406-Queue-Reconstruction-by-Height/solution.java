public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>(){
           public int compare(int[]o1,int[]o2)
           {
               if(o1[0] == o2[0])
               {
                   return Integer.compare(o1[1],o2[1]);
               }
               else
               {
                   return Integer.compare(o2[0],o1[0]);
               }
           }
        });
        
        List<int[]> al = new LinkedList<int[]>();
        for(int[] p : people)
        {
            al.add(p[1],p);
        }
        return al.toArray(new int[people.length][]);
    }
}