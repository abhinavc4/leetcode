public class MovingAverage {
    
    Queue<Integer> q = null;
    int sum ;
    int size ;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        q= new LinkedList<Integer>();
        sum = 0;
        this.size =size;
    }
    
    public double next(int val) {
        sum+=val;
        q.offer(val);
        while(q.size()>size)
        {
            sum-=q.poll();
        }
        return (double)sum/q.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */