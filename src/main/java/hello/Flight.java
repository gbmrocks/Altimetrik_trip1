package hello;

import java.util.ArrayList;

public class Flight {
	private String origin;
	 private String currency;


	 ArrayList < Results > results = new ArrayList < Results > ();




	 
	public ArrayList<Results> getResults() {
		return results;
	}

	public void setResults(ArrayList<Results> results) {
		this.results = results;
	}

	public String getOrigin() {
	  return origin;
	 }

	 public String getCurrency() {
	  return currency;
	 }

 

	 public void setOrigin(String origin) {
	  this.origin = origin;
	 }

	 public void setCurrency(String currency) {
	  this.currency = currency;
	 }
	}

