/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public boolean canAttendMeetings(Interval[] intervals) {
        int len = intervals.length;
        if(len ==0 ||len ==1)
        {
            return true;
        }
        Comparator<Interval> c = new Comparator<Interval>(){
            public int compare(Interval a , Interval b)
            {
                if(a.start == b.start)
                {
                    return Integer.compare(a.end,b.end);
                }
                return Integer.compare(a.start,b.start);
            }
            public boolean equals(Interval a , Interval b)
            {
                if(a.start == b.start && a.end == b.end)
                {
                    return true;
                }
                return false;
            }
        };
        List<Interval> l = new ArrayList<Interval>();
        for(Interval i : intervals)
        {
            l.add(i);
        }
        Collections.sort(l,c);
        for(int i = 1 ; i < intervals.length ; i++)
        {
            if(l.get(i-1) == l.get(i))
            {
                return false;
            }
            else if(l.get(i).start<l.get(i-1).end)
            {
                return false;
            }
        }
        return true;
    }
}