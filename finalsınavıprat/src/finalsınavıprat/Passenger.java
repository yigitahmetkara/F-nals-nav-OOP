package finalsınavıprat;

public class Passenger {

	public String name;

	public String passoportnumber;

	public String contactInfo;

	public Passenger(String name, String passoportnumber, String contactInfo) {
		this.contactInfo = contactInfo;
		this.name = name;
		this.passoportnumber = passoportnumber;

	}

	public String getname() {
		return name;

	}

	public String getpassoportnumber() {
		return passoportnumber;

	}

	public String getcontactInfo() {
		return contactInfo;

	}

}
