package trip.model;

public class Contact {
	 private String type;
	 private String detail;


	 // Getter Methods 

	 public String getType() {
	  return type;
	 }

	 public String getDetail() {
	  return detail;
	 }

	 // Setter Methods 

	 public void setType(String type) {
	  this.type = type;
	 }

	 @Override
	public String toString() {
		return "Contact [type=" + type + ", detail=" + detail + "]";
	}

	public void setDetail(String detail) {
	  this.detail = detail;
	 }
}
