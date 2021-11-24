package test.MongoTemplate.model;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "person")
public class Person {
	
	@Id
	private String personId;
	private String name;
	private String email;
	private String address;
	private String[] phoneNumbers;
	private Address addressObject;
	
	public String[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(String[] PhoneNumbers) {
		this.phoneNumbers = PhoneNumbers;
	}

	public Person(){
		
	}
	
	public Person(String personId, String name, String email, String address, String[] phoneNumbers,
			Address addressObject, String updateMultiplePersonName) {
		super();
		this.personId = personId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNumbers = phoneNumbers;
		this.addressObject = addressObject;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String PersonId) {
		personId = PersonId;
	}

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		name = Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String Email) {
		email = Email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String Address) {
		address = Address;
	}

	public Address getAddressObject() {
		return addressObject;
	}

	public void setAddressObject(Address addressObject) {
		this.addressObject = addressObject;
	}
	
	

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", phoneNumbers=" + Arrays.toString(phoneNumbers) + ", addressObject=" + addressObject + "]";
	}
}
