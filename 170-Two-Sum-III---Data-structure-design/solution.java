public class TwoSum {
    
    ArrayList<Integer> a  = null;

    // Add the number to an internal data structure.
    public TwoSum()
    {
        a = new ArrayList<Integer>();
    }
	public void add(int number) {
	    a.add(number);
	}

    // Find if there exists any pair of numbers which sum is equal to the value.
	public boolean find(int value) {
	    if(a.size()==0)
	    {
	        return false;
	    }
	    HashSet<Integer>   hs = new HashSet<Integer>();
	    for(int i = 0 ; i<a.size();i++)
	    {
	        if(hs.contains(value - a.get(i)))
	        {
	            return true;
	        }
	        hs.add(a.get(i));
	    }
	    return false;
	}
}
// Your TwoSum object will be instantiated and called as such:
// TwoSum twoSum = new TwoSum();
// twoSum.add(number);
// twoSum.find(value);