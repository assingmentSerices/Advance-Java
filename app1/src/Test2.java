

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext(args, MyConfig2.class);
Emp2 emp1=(Emp2) context.getBean("emp1");
System.out.println(emp1);
	}

}
