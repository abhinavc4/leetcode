public class MinStack {

    /** initialize your data structure here. */
    Deque<Integer> nSt = null;
    Deque<Element> cSt = null;
    public class Element
    {
        int value;
        int count;
        public Element(int val,int c)
        {
            value = val;
            count = c;
        }
    }
    public MinStack() {
        nSt = new LinkedList<Integer>();
        cSt = new LinkedList<Element>();
    }
    
    public void push(int x) {
        nSt.addFirst(x);
        if(cSt.isEmpty())
        {
            cSt.addFirst(new Element(x,1));
        }
        else
        {
            if(cSt.peekFirst().value == x)
            {
                Element temp = cSt.removeFirst();
                temp.count++;
                cSt.addFirst(new Element(temp.value,temp.count));
            }
            else if(cSt.peekFirst().value>x)
            {
                cSt.addFirst(new Element(x,1));
            }
        }
        
    }
    
    public void pop() {
        if(!nSt.isEmpty())
        {
            Integer elem = nSt.removeFirst();
            if(!cSt.isEmpty())
            {
                if(cSt.peekFirst().value == elem)
                {
                    Element temp = cSt.removeFirst();
                    temp.count--;
                    if(temp.count > 0)
                    {
                        cSt.addFirst(new Element(temp.value,temp.count));
                    }
                }
            }
        }
    }
    
    public int top() {
            return nSt.peekFirst();
    }
    
    public int getMin() {
            return cSt.peekFirst().value;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */