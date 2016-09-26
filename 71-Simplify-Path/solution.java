public class Solution {
    public String simplifyPath(String path) {
        if(path.length()==0)
        {
            return "";
        }
        HashSet<String> hs = new HashSet<>(Arrays.asList(".","..",""));
        String[] path_arr = path.split("/");
        Deque<String> q = new LinkedList<String>();
        for(String val : path_arr)
        {
            if(val.equals(".."))
            {
                if(!q.isEmpty())
                {
                    q.removeFirst();
                }
            }
            if(!hs.contains(val))
            {
                q.addFirst(val);
            }
        }
        StringBuilder str = new StringBuilder();
        while(!q.isEmpty())
        {
            str.append("/"+q.removeLast());
        }
        return str.length()==0?"/":str.toString();
    }
}