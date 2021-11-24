package test.MongoTemplate.model;

public class Address {
	public Address(String street, String district) {
		super();
		this.street = street;
		this.district = district;
	}
	private String street;
	private String district;
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
}
