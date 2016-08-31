package rachio.secretsanta.controller;

import java.util.ArrayList;

public class Matcher {

	public Matcher() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * generate santa list
	 * 
	 * @param names (input list to sort)
	 * @return ArrayList (paired names)
	 */
	public ArrayList<String> generateList(ArrayList<String> names)
	{
		
		ArrayList<String> santaList = new ArrayList<String>();
		
		// Guard against empty list or non-initialized list
		if(names == null  || names.size() == 0) 
		{
			return santaList;
		}
		
		ArrayList<String> pairList = new ArrayList<String>();
		pairList.addAll(names);
		
		int randomNameindex= 0;
		for(String name: names)
		{
			try
			{
				do
				{
					randomNameindex= (int) Math.floor(Math.random() * pairList.size());
				}while(name.equals(pairList.get(randomNameindex)));
			}catch(IndexOutOfBoundsException e)
			{
				// log it
				System.out.println("Error occurred: " + e);
				System.exit(1);
			}
			finally
			{	
				santaList.add(name + "->" + pairList.get(randomNameindex) + "\n");
				pairList.remove(randomNameindex);
			}	
		}
		
		return santaList;
	}
}
