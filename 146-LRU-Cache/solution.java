public class LRUCache {
    static class Node
    {
        int key,value;
        Node prev;
        Node next;
        public Node(int k , int v)
        {
            key = k;
            value = v;
        }
        public Node()
        {
            this(0,0);
        }
    }
    int capacity = 0;
    int count = 0;
    Node head,tail;
    
    HashMap<Integer,Node> map;
    public LRUCache(int capacity) {
        map = new HashMap<Integer,Node>();
        this.capacity = capacity;
        this.count = 0;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        Node n = map.get(key);
        if(n==null)
        {
            return -1;
        }
        update(n);
        return n.value;
    }
    
    public void update(Node n)
    {
        remove(n);
        add(n);
    }
    
    public void remove(Node n)
    {
        Node prev = n.prev;
        Node next = n.next;
        prev.next = next;
        next.prev = prev;
    }
    
    public void add(Node n)
    {
        Node after = head.next;
        head.next = n;
        n.next = after;
        after.prev = n;
        n.prev = head;
    }
    
    public void set(int key, int value) {
        Node n = map.get(key);
        if(null==n)
        {
            n = new Node(key,value);
            map.put(key,n);
            add(n);
            ++count;
        }
        else
        {
            n.value = value;
            update(n);
        }
        if(count>capacity)
        {
            Node toDel = tail.prev;
            remove(toDel);
            map.remove(toDel.key);
            --count;
        }
    }
}