package crosswordsolution;

public class TrieNode {
    boolean isEndOfWord;
    public TrieNode[] children;

    public TrieNode() {
        isEndOfWord = false;
        children = new TrieNode[26];
    }
}
