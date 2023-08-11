

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("emp1")
public class Emp2 {
	@Autowired
private Addresss addresss;

public Addresss getAddresss() {
	return addresss;
}

public void setAddresss(Addresss addresss) {
	this.addresss = addresss;
}

public Emp2(Addresss addresss) {
	super();
	this.addresss = addresss;
}

public Emp2() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Emp2 [addresss=" + addresss + "]";
}

}
