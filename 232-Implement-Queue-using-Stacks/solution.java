class MyQueue {
    // Push element x to the back of queue.
    Deque<Integer> stackOne = new LinkedList<Integer>();
    Deque<Integer> stackTwo = new LinkedList<Integer>();
    public void push(int x) {
        stackOne.addFirst(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(stackTwo.size()!=0)
        {
            stackTwo.removeFirst();
            return;
        }
        
        while(stackOne.size()!=0)
        {
            stackTwo.addFirst(stackOne.removeFirst());    
        }
        stackTwo.removeFirst();
    }

    // Get the front element.
    public int peek() {
        if(stackTwo.size()!=0)
        {
            return stackTwo.peekFirst();
        }
        
        while(stackOne.size()!=0)
        {
            stackTwo.addFirst(stackOne.removeFirst());    
        }
        return stackTwo.peekFirst();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stackOne.isEmpty()&&stackTwo.isEmpty();
    }
}