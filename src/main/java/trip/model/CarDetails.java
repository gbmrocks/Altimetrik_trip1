package trip.model;

import java.util.ArrayList;

public class CarDetails {
	 Vehicle_info Vehicle_infoObject;
	 ArrayList < CarRate > rates = new ArrayList < CarRate > ();
	 Estimated_total Estimated_totalObject;


	 // Getter Methods 

	 public Vehicle_info getVehicle_info() {
	  return Vehicle_infoObject;
	 }

	 public Vehicle_info getVehicle_infoObject() {
		return Vehicle_infoObject;
	}

	public void setVehicle_infoObject(Vehicle_info vehicle_infoObject) {
		Vehicle_infoObject = vehicle_infoObject;
	}

	public ArrayList<CarRate> getRates() {
		return rates;
	}

	public void setRates(ArrayList<CarRate> rates) {
		this.rates = rates;
	}

	public Estimated_total getEstimated_totalObject() {
		return Estimated_totalObject;
	}

	public void setEstimated_totalObject(Estimated_total estimated_totalObject) {
		Estimated_totalObject = estimated_totalObject;
	}

	public Estimated_total getEstimated_total() {
	  return Estimated_totalObject;
	 }

	 // Setter Methods 

	 public void setVehicle_info(Vehicle_info vehicle_infoObject) {
	  this.Vehicle_infoObject = vehicle_infoObject;
	 }

	 public void setEstimated_total(Estimated_total estimated_totalObject) {
	  this.Estimated_totalObject = estimated_totalObject;
	 }
	}

   class Estimated_total {
	 private String amount;
	 private String currency;


	 // Getter Methods 

	 public String getAmount() {
	  return amount;
	 }

	 public String getCurrency() {
	  return currency;
	 }

	 // Setter Methods 

	 public void setAmount(String amount) {
	  this.amount = amount;
	 }

	 public void setCurrency(String currency) {
	  this.currency = currency;
	 }
	}
	
   class Vehicle_info {
	 private String acriss_code;
	 private boolean air_conditioning;
	 private String transmission;
	 private String fuel;
	 private String category;
	 private String type;


	 // Getter Methods 

	 public String getAcriss_code() {
	  return acriss_code;
	 }

	 public boolean getAir_conditioning() {
	  return air_conditioning;
	 }

	 public String getTransmission() {
	  return transmission;
	 }

	 public String getFuel() {
	  return fuel;
	 }

	 public String getCategory() {
	  return category;
	 }

	 public String getType() {
	  return type;
	 }

	 // Setter Methods 

	 public void setAcriss_code(String acriss_code) {
	  this.acriss_code = acriss_code;
	 }

	 public void setAir_conditioning(boolean air_conditioning) {
	  this.air_conditioning = air_conditioning;
	 }

	 public void setTransmission(String transmission) {
	  this.transmission = transmission;
	 }

	 public void setFuel(String fuel) {
	  this.fuel = fuel;
	 }

	 public void setCategory(String category) {
	  this.category = category;
	 }

	 public void setType(String type) {
	  this.type = type;
	 }
}
