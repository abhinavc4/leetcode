class TrieNode {
    // Initialize your data structure here.
    int R = 26;
        TrieNode[] links;
        boolean isEnd;
    public TrieNode() {
            links = new TrieNode[R];
        }
        
        boolean containsKey(char ch)
        {
            return links[ch-'a'] != null;
        }
        
        TrieNode get(char ch)
        {
            return links[ch-'a'];
        }
        
        void put(TrieNode root , char ch)
        {
            links[ch-'a'] = root;
        }
        
        void setEnd()
        {
            isEnd = true;
        }
        
        boolean getEnd()
        {
            return isEnd;
        }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode curr = root;
        for(int i = 0 ; i < word.length();i++)
        {
            char currentChar = word.charAt(i);
            if(!curr.containsKey(currentChar))
            {
                curr.put(new TrieNode(),currentChar);
            }
            curr = curr.get(currentChar);
        }
        curr.setEnd();
    }

    public TrieNode searchPrefix(String word)
    {
        TrieNode curr = root;
        for(int i = 0 ; i < word.length();i++)
        {
            if(curr.containsKey(word.charAt(i)))
            {
                curr = curr.get(word.charAt(i));
            }
            else
            {
                return null;
            }
        }
        return curr;
    }
    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode curr = searchPrefix(word);
        return curr != null && curr.getEnd();
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode curr = searchPrefix(prefix);
        return curr!=null;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");