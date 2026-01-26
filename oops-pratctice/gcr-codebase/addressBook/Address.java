package addressBook;

public class Address {
	String name ;
	String address;
	String city;
	String state;
	int pincode;
	String phoneNumber;
	String email;
	Address(
			String name ,
			String address,
			String city,
			String state,
			int pincode,
			String phoneNumber,
			String email  )
	{
		this.name = name;
		this.address=address;
		this.city=city;
		this.state=state;
		this.pincode=pincode;
		this.phoneNumber = phoneNumber;
		this.email=email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String  phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
	    return "Name: " + name +
	           ", Address: " + address +
	           ", City: " + city +
	           ", State: " + state +
	           ", Pincode: " + pincode +
	           ", Phone: " + phoneNumber +
	           ", Email: " + email;
	}
}
