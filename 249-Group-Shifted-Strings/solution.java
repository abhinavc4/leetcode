public class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> l = new ArrayList<List<String>>();
        HashMap<String,List<String>> hm = new HashMap<String,List<String>>();
        int len = strings.length;
        if(len ==0)
        {
            return l;
        }
        for(int i = 0 ; i < len ; i++)
        {
            String s = strings[i];
            int lenEach = s.length();
            char[] chArray = s.toCharArray();
            if(lenEach != 0)
            {
                int diff = chArray[0]-'a';
                for(int j = 0 ; j < lenEach;j++)
                {
                    if((char)(chArray[j]-diff)<'a')
                    {
                        chArray[j] = (char)(chArray[j]-diff+26);
                    }
                    else
                    {
                        chArray[j] = (char)(chArray[j]-diff);
                    }
                }
            }
            s = new String(chArray);
            List<String> list = hm.get(s);
            if(list == null)
            {
                list = new ArrayList<String>();
            }
            list.add(strings[i]);
            hm.put(s,list);
        }
        
        for(Map.Entry<String,List<String>> hmES :hm.entrySet())
        {
            List<String> s = hmES.getValue();
            Collections.sort(s);
            l.add(new ArrayList<String>(s));
        }
        return l;
        
    }
}