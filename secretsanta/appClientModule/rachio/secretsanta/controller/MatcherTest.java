package rachio.secretsanta.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rachio.secretsanta.datastore.DataStore;

public class MatcherTest {

  @Test
  public void generateNullList() {
		Matcher matcher = new Matcher();
		
		ArrayList<String> santaList = matcher.generateList(null);
		assertEquals(santaList.size(), 0);
  }
  
  @Test
  public void generateValidList() {
		Matcher matcher = new Matcher();
		DataStore datastore = new DataStore();
		
		ArrayList<String> santaList = matcher.generateList(datastore.getNames());
		assertEquals(santaList.size(), 7);
  }
  
  
  @Test
  public void generateEmptyList() {
		Matcher matcher = new Matcher();
		
		ArrayList<String> santaList = matcher.generateList(new ArrayList<String>());
		assertEquals(santaList.size(), 0);
  }
}
