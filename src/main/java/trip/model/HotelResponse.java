package trip.model;

public class HotelResponse {
	java.util.ArrayList<Hotel> results;

	public java.util.ArrayList<Hotel> getResults() {
		return results;
	}

	public void setResults(java.util.ArrayList<Hotel> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "HotelResponse [results=" + results + "]";
	}
	
}
