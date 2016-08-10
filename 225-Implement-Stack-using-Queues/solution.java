class MyStack {
    // Push element x onto stack.
    Queue<Integer> l1 = new LinkedList<Integer>();
    Queue<Integer> l2 = new LinkedList<Integer>();
    public void push(int x) {
        if(empty())
        {
            l1.offer(x);
        }
        else
        {
            if(l1.size()>0)
            {
                l2.offer(x);
                while(!l1.isEmpty())
                {
                    l2.offer(l1.poll());
                }
            }
            else if(l2.size()>0)
            {
                l1.offer(x);
                while(!l2.isEmpty())
                {
                    l1.offer(l2.poll());
                }
            }
        }
        
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(l1.size()>0)
        {
            l1.poll();
        }
        if(l2.size()>0)
        {
            l2.poll();
        }
    }

    // Get the top element.
    public int top() {
        if(l1.size()>0)
        {
            return l1.peek();
        }
        else
        {
            return l2.peek();
        }
        
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return l1.isEmpty() && l2.isEmpty();
        
    }
}