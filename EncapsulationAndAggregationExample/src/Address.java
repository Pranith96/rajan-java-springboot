
public class Address {

	private int addressId;
	private String plotNo;
	private String locality;
	private String city;
	private String state;
	private String country;

	public Address() {
	}

	public Address(int addressId, String plotNo, String locality, String city, String state, String country) {
		this.addressId = addressId;
		this.plotNo = plotNo;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", plotNo=" + plotNo + ", locality=" + locality + ", city=" + city
				+ ", state=" + state + ", country=" + country + "]";
	}

}
