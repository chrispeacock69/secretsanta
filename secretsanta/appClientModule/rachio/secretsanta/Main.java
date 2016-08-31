package rachio.secretsanta;

import java.util.ArrayList;

import rachio.secretsanta.controller.Matcher;
import rachio.secretsanta.datastore.DataStore;

public class Main {
	public static void main(String[] args) {
		Matcher matcher = new Matcher();
		DataStore datastore = new DataStore();
		
		ArrayList<String> santaList = matcher.generateList(datastore.getNames());
		
		for(String pair: santaList)
		{
			System.out.print(pair);
		}
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}