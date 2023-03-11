package crosswordsolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.List;

//***********************************Instructions********************************
/*
*Implement a Crossword Solver
* 1. User needs to be able to input a pattern of a combination of known letters and wildcards. 
*  The input format should use an asterisk: '*' (U+002A) as a wildcard.
*  Make this simple!
*  
* 2. The program should return all words in the dictionary that match the input pattern. 
*  This means you won't be solving a whole crossword - just providing options for what would 
*  fit in a crossword row or column.
*      
*  Example Input: b**r
*  Output: Found 5 words in 1000 ms: Bear, Beer, Bier, Birr, Blur, Boar, Boor, Brrr, Buhr, Burr
*   
*  Example Input: *eel
*  Output: Found 8 words in 1000 ms: Feel, Heel, Keel, Peel, Reel, Seel, Teel, Weel
*   
* 3. An example dictionary .csv is included for your convenience. You can/should use the default Java libraries to load it.
* 4. Be sure to indicate how long your solution takes to load its structures, and produce a result.
*      Hint: display the time to process a result AFTER printing them out, otherwise you won't be able to see it in large result sets.
* 
* A few final points:
* 1. The order of priorities for the solution should be: Correctness, Performance, elegance, and usability.
* 2. Startup time and memory usage are much less important than the time taken to solve the crossword pattern (which is critical).
* 3. Error handling and input validation are nice to haves, as long as your control schemes and instructions are clear.
* 4. Do not change the method signature or parameters of GetPossibleWords. In other words your solution should be built around this method.
* 
*/
public class Program {

	public static void main(String[] args) {

	}

	public static List<String> GetPossibleWords(String template, Collection<String> dict)
    {
        return new ArrayList<String>();
    }
}
