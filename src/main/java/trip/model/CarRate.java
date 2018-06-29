package trip.model;

public class CarRate {
	 private String type;
	 Price PriceObject;


	 // Getter Methods 

	 public String getType() {
	  return type;
	 }

	 public Price getPrice() {
	  return PriceObject;
	 }

	 // Setter Methods 

	 public void setType(String type) {
	  this.type = type;
	 }

	 public void setPrice(Price priceObject) {
	  this.PriceObject = priceObject;
	 }
	}
   
   class Price {
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
