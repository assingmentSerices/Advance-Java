package com.add.The_Main;

import java.util.Scanner;

import com.add.user;

import dioemplement.Test;

public class The_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user u = new user();
		Test ipl = new Test();
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("1. For Login \n 2. For SignUp \n 3. For Update Email Using I'd \n4. For Soft_Delete ");
				int choice = scan.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter Email.....");
					String mail = scan.nextLine();
					System.out.println("Enter Password...");
					String pass = scan.nextLine();
					if(ipl.login(mail,pass))
					{
						System.out.println("Login Success.....");
					}
					else
					{
						System.out.println("This Email Does't Exist.Please SignUp....");
					}
					break;
				case 2:
					System.out.println("enter name");
					scan.nextLine();
					String name = scan.nextLine();
					System.out.println("Enter New Email I'd...");
					String email = scan.nextLine();
					System.out.println("Create Strong Password...");
					String pwd = scan.nextLine();
					scan.close();
					u.setUname(name);
					u.setUemail(email);
					u.setUpassword(pwd);
					if(ipl.Singup(u))
					{
						System.out.println("SignUp Success...");
					}
					else
					{
						System.out.println("ERROR....");
					}
					break;
				case 3:
					System.out.println("Enter Your I'd for Updation...");
					int id = scan.nextInt();
					scan.nextLine();
					System.out.println("Enter Updated Email...");
					String Email = scan.nextLine();
					if(ipl.Update(id, Email))
					{
		
	                  System.out.println("Email Updated....");
					} 
					else
					{
						System.out.println("ERROR...");
					}
					break;
				case 4:
					System.out.println("Enter Your I'd...");
					int i = scan.nextInt();
					scan.nextLine();
					System.out.println("Enter Email.....");
					String e = scan.nextLine();
					if(ipl.Soft(i, e))
					{
						System.out.println("Soft_Deletion Successfull...");
					}
					else
					{
						System.out.println("ERROR...");
					}
					break;
					
				default:
					System.out.println("Invalid Choice..");
				}

				scan.close();
		}
		// TODO Auto-generated method stub
	 }
	

