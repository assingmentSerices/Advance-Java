

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("emp1")
public class Emp {
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp(Address address) {
		super();
		this.address = address;
		//System.out.println("hii");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	
	

	
	
	

}
