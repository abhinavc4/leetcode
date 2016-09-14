public class Solution {
    public List<String> findItinerary(String[][] tickets) {
        HashMap<String,PriorityQueue<String>> hm = new HashMap<String,PriorityQueue<String>>();
        for(int i = 0 ; i < tickets.length;i++)
        {
            hm.putIfAbsent(tickets[i][0],new PriorityQueue<String>());
            hm.get(tickets[i][0]).add(tickets[i][1]);
        }
        List<String> al = new ArrayList<String>();
        dfs("JFK",hm,al,tickets);
        return al;
        
    }
    void dfs(String begin,HashMap<String,PriorityQueue<String>> hm,List<String> al,String[][] tickets)
    {
        PriorityQueue<String> pq = hm.get(begin);
        while(pq != null && !pq.isEmpty())
        {
            dfs(pq.poll(),hm,al,tickets);
        }
        al.add(0,begin);
        
    }
}