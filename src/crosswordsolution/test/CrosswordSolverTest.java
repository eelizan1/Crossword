package crosswordsolution.test;

import crosswordsolution.CrosswordSolver;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class CrosswordSolverTest {
    private List<String> DICTIONARY = new ArrayList<>();
    private CrosswordSolver crosswordSolver;

    @Before
    public void setUp() {
        crosswordSolver = new CrosswordSolver();

        DICTIONARY.add("Bear");
        DICTIONARY.add("Beer");
        DICTIONARY.add("Bier");
        DICTIONARY.add("Birr");
        DICTIONARY.add("Blur");
        DICTIONARY.add("Boar");
        DICTIONARY.add("Boor");
        DICTIONARY.add("Brrr");
        DICTIONARY.add("Buhr");
        DICTIONARY.add("Burr");
        DICTIONARY.add("Feel");
        DICTIONARY.add("Heel");
        DICTIONARY.add("Keel");
        DICTIONARY.add("Peel");
        DICTIONARY.add("Reel");
        DICTIONARY.add("Seel");
        DICTIONARY.add("Teel");
        DICTIONARY.add("Weel");
    }
    @Test
    public void testCrosswordSolverSuccessPatternOne() {
        String pattern = "b**r";

        List<String> actual = crosswordSolver.getPossibleWords(pattern, DICTIONARY);
        List<String> expected =  new ArrayList<>();
        expected.add("bear");
        expected.add("beer");
        expected.add("bier");
        expected.add("birr");
        expected.add("blur");
        expected.add("boar");
        expected.add("boor");
        expected.add("brrr");
        expected.add("buhr");
        expected.add("burr");

        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void testCorsswordSolverSuccessPatternTwo() {
        String pattern = "*eel";

        List<String> actual = crosswordSolver.getPossibleWords(pattern, DICTIONARY);
        List<String> expected =  new ArrayList<>();
        expected.add("feel");
        expected.add("heel");
        expected.add("keel");
        expected.add("peel");
        expected.add("reel");
        expected.add("seel");
        expected.add("teel");
        expected.add("weel");

        assertNotNull(actual);
        assertEquals(expected, actual);
    }
}
