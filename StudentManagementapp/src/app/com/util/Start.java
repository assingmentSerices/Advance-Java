package app.com.util;

import java.io.IOException;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) throws IOException{
		try (// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in)) {

    while(true)
     {
    	System.out.println("press 1 to add student"); 
    	System.out.println("press 2 to delete student");
    	System.out.println("press 3 to display student");
    	System.out.println("press 4 to exit student");
    	 int c=scan.nextInt();
    	 scan.nextLine();
    	if(c==1)
    	{
    		//add Student....
    		
    		System.out.println("Enter user name :");
    		String name=scan.nextLine();
    		System.out.println("Enter user phone number");
    		String phone=scan.nextLine();
    		System.out.println("Enter user city");
    		String city=scan.nextLine();
    		
    		Student st= new Student();
    		st.setStudentName(name);
    		st.setStudentPhone(phone);
    		st.setStudentCity(city);
    		
        System.out.println(st.getStudentCity());  		
    	Boolean answer=StudentDao.insertStudentToDB(st);
    	if(answer)
    	{
    	System.out.println("Student is add successfully");
    	}
    	else
    	{
    		System.out.println("worg");
    	}
    		
    	System.out.println(st);
    	}
    	
    	else if(c==2)
    	{
//    		delete student...
    		System.out.println("Enter student id to delete:");
    		int userId=scan.nextInt();
    		boolean g=StudentDao.deleteStudent(userId);
    		if(g)
    		{
    			System.out.println("delete");
    		}
    		else
    		{
    			System.out.println("Worg");
    			
    		}
    	}
    	else if(c==3)
    	{
    		//display student
    		//StudentDao.displayAllStudent();
    		
    	}
    	else if(c==4)
    	{
    		//exit
   		break;
    	}
    	else
    	{
    		
    	}
     }
	}
		System.out.println("thankyou");
      
	}
}


