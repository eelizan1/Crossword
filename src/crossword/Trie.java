package crossword;

import java.util.*;
class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isEndOfWord;
    }

    public List<String> searchWildcard(String pattern) {
        List<String> results = new ArrayList<>();
        searchWildcardHelper(pattern, root, "", results);
        return results;
    }

    // DFS search
    private void searchWildcardHelper(String pattern, TrieNode node, String word, List<String> results) {
        if (node == null) {
            return;
        }

        if (pattern.length() == 0) {
            if (node.isEndOfWord) {
                results.add(word);
            }
            return;
        }

        char c = pattern.charAt(0);
        if (c == '*') {
            for (int i = 0; i < 26; i++) {
                char nextChar = (char) (i + 'a');
                searchWildcardHelper(pattern.substring(1), node.children[i], word + nextChar, results);
            }
        } else {
            int index = c - 'a';
            searchWildcardHelper(pattern.substring(1), node.children[index], word + c, results);
        }
    }
}
