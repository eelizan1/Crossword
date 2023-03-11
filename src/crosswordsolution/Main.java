package crosswordsolution;

import java.util.*;

public class Main {
    private static final String DICTIONARY_PATH = "src/crosswordsolution/files/english.csv";

    public static void main(String[] args) {
        CrosswordSolver crosswordSolver = new CrosswordSolver();
        Collection<String> dictionary = crosswordSolver.loadDictionaryToList(DICTIONARY_PATH);

        List<String> res1 = crosswordSolver.getPossibleWords("b**r", dictionary);
        List<String> res2 = crosswordSolver.getPossibleWords("*eel", dictionary);
    }
}
