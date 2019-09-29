package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String email;
	private String lastName;
	private String password;
	
	

	private String department;
	private String alternateEmail;
	private int mailboxCapacity = 20;
	private int defaultPassLength = 10;
	private String companySuffix = "xyz";
	//constructor to assign the firstName and the LastName
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//System.out.println("the email is : "+ this.firstName + " "+this.lastName);
		this.department = setDepartment();
		
		
		this.password = setPassword(this.defaultPassLength);
		System.out.println("the password generated is = "+this.password);
		
		//Generate the email
		this.email = this.firstName+"."+this.lastName+"@"+this.department+"."+this.companySuffix+"."+"com";
		
	}
	
	//function to ask for department
	private String setDepartment() {
		System.out.print("New Worker : "+this.firstName+" "+this.lastName+"\nDepartment Codes\n1 for sales\n2 for Develpoment\n3 for accounting\n0 for none\nEnter Department Code : ");
		Scanner in = new Scanner(System.in);
		int depCode = in.nextInt();
		if(depCode == 1)return "Sales";
		else if(depCode == 2)return "development";
		else if(depCode == 3)return "accounting";
		else
			return "";
	}
	
	//function to set the password
	private String setPassword(int len) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password = new char[len];
		//generating a random number to get the random character from the passwordSet and add it to the password array
		for(int i = 0; i < len; i++) {
			int randomNumber = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(randomNumber);
		}
		return new String(password);
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	public String showInfo() {
		return "DISPLAY NAME : " + this.firstName + " "+ this.lastName+
				"\nEMAIL : "+ this.email+
				"\nMAILBOX CAPACITY : "+this.mailboxCapacity+"mb";
	}

}
