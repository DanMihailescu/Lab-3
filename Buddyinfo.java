
public class Buddyinfo {
	int phoneNumber;
	String name;
	String address;

	public Buddyinfo() {
		name = "Henry";
		phoneNumber = 12;
		address = "Fake";
	}
	
	public static void main(String[] args) { 
		Buddyinfo b = new Buddyinfo();
		System.out.println("Hello " + b.name);
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
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

}
