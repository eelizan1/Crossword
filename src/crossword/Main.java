package crossword;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static crosswordsolver.Program.GetPossibleWords;

public class Main {
    private static final String DICTIONARY_PATH = "src/crossword/files/english.csv";

    public static void main(String[] args) {
        CrosswordSolver crosswordSolver = new CrosswordSolver();
        Collection<String> dictionary = crosswordSolver.loadDictionaryToList(DICTIONARY_PATH);

        List<String> res1 = crosswordSolver.getPossibleWords("b**r", dictionary);
        List<String> res2 = crosswordSolver.getPossibleWords("*eel", dictionary);
    }
}
