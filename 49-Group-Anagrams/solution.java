public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<String,List<String>>();
        for(String str : strs)
        {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);
            List<String> l = hm.getOrDefault(temp,new ArrayList<String>());
            l.add(str);
            hm.put(temp,l);
        }
        return new ArrayList<List<String>>(hm.values());
    }
}