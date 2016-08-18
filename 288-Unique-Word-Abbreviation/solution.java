public class ValidWordAbbr {

    public String makeAbbreviation(String val)
    {
        StringBuilder s = new StringBuilder();
        int length = val.length();
        if(length<=2)
        {
            return val;
        }
        s.append(val.charAt(0));
        s.append(length-2);
        s.append(val.charAt(length-1));
        return s.toString();
    }
    
    HashMap<String,Boolean> hm = null;
    HashSet<String> hs = null;
    public ValidWordAbbr(String[] dictionary) {
        hm = new HashMap<String,Boolean>();
         hs = new HashSet<String>(Arrays.asList(dictionary));
        for(String d : hs)
        {
            String abbr = makeAbbreviation(d);
            hm.put(abbr,!hm.containsKey(abbr));
        }
    }

    public boolean isUnique(String word) {
        String s = makeAbbreviation(word);
        Boolean b = hm.get(s);
        return b==null || b == true && hs.contains(word);
    }
}


// Your ValidWordAbbr object will be instantiated and called as such:
// ValidWordAbbr vwa = new ValidWordAbbr(dictionary);
// vwa.isUnique("Word");
// vwa.isUnique("anotherWord");