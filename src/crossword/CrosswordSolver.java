package crossword;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class CrosswordSolver {
    private Trie trie;

    public CrosswordSolver() {
        trie = new Trie();
    }

    public Collection<String> loadDictionaryToList(String filename) {
        List<String> words = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }

    public List<String> getPossibleWords(String pattern, Collection<String> dict) {
        long start = System.currentTimeMillis();
        loadDictionaryIntoTrie(dict);
        List<String> words = trie.searchWildcard(pattern.toLowerCase());
        long end = System.currentTimeMillis();

        System.out.println("Found " + words.size() + " words in " + (end - start) + " ms: " + String.join(", ", words));
        return words;
    }

    private void loadDictionaryIntoTrie(Collection<String> dict) {
        for (String word : dict) {
            trie.insert(word.trim().toLowerCase());
        }
    }
}
