package rachio.secretsanta.datastore;

import java.util.ArrayList;

public class DataStore {
	private ArrayList<String> names = new ArrayList<String>();
	
	public DataStore()
	{
		names.add("Chris");
		names.add("Cira");
		names.add("Alex");
		names.add("Bella");
		names.add("Sammy");
		names.add("Emily");
		names.add("Gabriella");
	}
	
	/**
	 * @return ArrayList (names to be paired)
	 */
	public ArrayList<String> getNames()
	{
		return names;
	}
}
