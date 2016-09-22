
public class WordDictionary {
    class TrieNode
    {
        int R;
        TrieNode[] list;
        boolean isEnd;
        TrieNode()
        {
            R = 26;
            list = new TrieNode[R];
        }
        void set(TrieNode root , char value)
        {
            list[value-'a'] = root;    
        }
        
        TrieNode get(char ch)
        {
            return list[ch-'a'];
        }
    
        boolean containsKey(char ch)
        {
            if(list[ch-'a']!=null)
            {
                return true;
            }
            return false;
        }
    
    }
    TrieNode root ;
    public WordDictionary()
    {
        root = new TrieNode();
    }
    // Adds a word into the data structure.
    public void addWord(String word) {
        TrieNode curr = root;
        for(int i = 0 ; i < word.length();i++)
        {
            char ch = word.charAt(i);
            if(!curr.containsKey(ch))
            {
                curr.list[ch-'a']=new TrieNode();
            }
            curr = curr.get(ch);
        }
        curr.isEnd = true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean helper(String word,int index,TrieNode root)
    {
        if(index>=word.length())
        {
            return root.isEnd;
        }
        char ch = word.charAt(index);
        if('.' == ch)
        {
            for(int i = 0 ; i <root.list.length;i++)
            {
                if(root.list[i]!=null && helper(word,index+1,root.list[i]))
                {
                    return true;
                }
            }
            return false;
        }
        else
        {
            return root.list[ch-'a']!=null && helper(word,index+1,root.list[ch-'a']);
        }
            
    }
    public boolean search(String word) {
        return helper(word,0,root);
    }
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");