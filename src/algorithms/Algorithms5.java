package algorithms;

import java.util.List;

public class Algorithms5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Create an efficient cache of records as a field.
    // The structure of a cache should not be an List<Record>. Use your own data structure.
    public static void loadRecordsIntoCache(List<Record> records)
    {

    }
    
    public static Record getRecord(int pk_1, int pk_2)
    {
        // Implement GetRecord. Need to retrieve value from the cache. Retrieval should be very fast.
        return null;
    }
}

// Record should be indexed by the combination of pk_1 and pk_2 (each are part of the "primary key"). 
class Record
{
    private int pk_1;
    private int pk_2;
    private String value;
    
    public Record () {
    	
    }
    
    public Record (int PK_1, int PK_2, String Value) {
    	pk_1 = PK_1;
    	pk_2 = PK_2;
    	value = Value;
    }
    
    public void setPK_1 (int PK_1) {
    	pk_1 = PK_1;
    }
    
    public int getPK_1 () {
    	return pk_1;
    }
    
    public void setPK_2 (int PK_2) {
    	pk_2 = PK_2;
    }
    
    public int getPK_2 () {
    	return pk_2;
    }
    
    public void setValue (String Value) {
    	value = Value;
    }
    
    public String getValue () {
    	return value;
    }
}
