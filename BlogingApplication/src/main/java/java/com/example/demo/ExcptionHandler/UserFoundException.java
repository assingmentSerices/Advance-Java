package java.com.example.demo.ExcptionHandler;

@SuppressWarnings("serial")
public class UserFoundException extends RuntimeException {
	public UserFoundException() {
		super();
	}
	public UserFoundException(String Message) {
		super(Message);
	}
}
