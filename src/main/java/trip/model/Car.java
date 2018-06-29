package trip.model;

import java.util.ArrayList;

public class Car {
	 Provider ProviderObject;
	 private String branch_id;
	 Location LocationObject;
	 private String airport;
	 Address AddressObject;
	 ArrayList < CarDetails > cars = new ArrayList < CarDetails > ();


	 // Getter Methods 

	 public Provider getProvider() {
	  return ProviderObject;
	 }

	 public Provider getProviderObject() {
		return ProviderObject;
	}

	public void setProviderObject(Provider providerObject) {
		ProviderObject = providerObject;
	}

	public Location getLocationObject() {
		return LocationObject;
	}

	public void setLocationObject(Location locationObject) {
		LocationObject = locationObject;
	}

	public Address getAddressObject() {
		return AddressObject;
	}

	public void setAddressObject(Address addressObject) {
		AddressObject = addressObject;
	}

	public ArrayList<CarDetails> getCars() {
		return cars;
	}

	public void setCars(ArrayList<CarDetails> cars) {
		this.cars = cars;
	}

	public String getBranch_id() {
	  return branch_id;
	 }

	 public Location getLocation() {
	  return LocationObject;
	 }

	 public String getAirport() {
	  return airport;
	 }

	 public Address getAddress() {
	  return AddressObject;
	 }

	 // Setter Methods 

	 public void setProvider(Provider providerObject) {
	  this.ProviderObject = providerObject;
	 }

	 public void setBranch_id(String branch_id) {
	  this.branch_id = branch_id;
	 }

	 public void setLocation(Location locationObject) {
	  this.LocationObject = locationObject;
	 }

	 public void setAirport(String airport) {
	  this.airport = airport;
	 }

	 public void setAddress(Address addressObject) {
	  this.AddressObject = addressObject;
	 }
	}

	class Provider {
	 private String company_code;
	 private String company_name;


	 // Getter Methods 

	 public String getCompany_code() {
	  return company_code;
	 }

	 public String getCompany_name() {
	  return company_name;
	 }

	 // Setter Methods 

	 public void setCompany_code(String company_code) {
	  this.company_code = company_code;
	 }

	 public void setCompany_name(String company_name) {
	  this.company_name = company_name;
	 }
}
