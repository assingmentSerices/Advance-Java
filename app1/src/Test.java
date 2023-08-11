

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
ApplicationContext   context = new AnnotationConfigApplicationContext(myconfig.class);
      
Emp emp1  = (Emp) context.getBean("emp1");
      System.out.println(emp1);
	}

}
