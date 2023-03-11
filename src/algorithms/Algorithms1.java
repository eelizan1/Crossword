package algorithms;

import java.util.List;

public class Algorithms1 {

	public static void main(String[] args) {

	}

	/* Problem: Create a function that returns whether or not a given growth rate table is valid
     * A table is valid if:
     *      It spans all weeks 1 through 53.
     *      Each row can have multiple weeks.
     *      All rows cover a time period moving forward
     *      No overlapping weeks appear in the table.
     *      The sum of all growth percentages in the table is equal to 1
     *  Example Valid Table:
     *      Row Index   StartWeek   EndWeek     GrowthPct
     *      1           1           4           .1
     *      2           8           10          .17
     *      3           5           7           .05
     *      4           11          53          .68
     *  Other notes:
     *      The table does not have a guaranteed order
     *      You may use any Java functions available to you or build additional structures if necessary
     *      The order of priorities for the solution should be: Correctness, Elegance/Style, and Performance.
    */
    public static boolean IsValid(GrowthTable t)
    {
        return true;
    }
}

class GrowthTable
{
	private List<GrowthTableRow> growthTableRows;

	public GrowthTable() { }

    public void setGrowthTable (List<GrowthTableRow> rows)
    {
    	growthTableRows = rows;
    }

    public List<GrowthTableRow> getGrowthTable(){
    	return growthTableRows;
    }
}

class GrowthTableRow
{
	private int startWeek;
    private int endWeek;
    private double growthPct;

    public GrowthTableRow() { }

    public GrowthTableRow (int start, int end, double growth)
    {
        startWeek = start;
        endWeek = end;
        growthPct = growth;
    }

    public void setStartWeek(int StartWeek) {
    	startWeek = StartWeek;
    }

    public int getStartWeek() {
    	return startWeek;
    }

    public void setEndWeek(int EndWeek) {
    	endWeek = EndWeek;
    }

    public int getEndWeek() {
    	return endWeek;
    }

    public void setGrowthPct(double GrowthPct) {
    	growthPct = GrowthPct;
    }

    public double getGrowthPct() {
    	return growthPct;
    }
}
