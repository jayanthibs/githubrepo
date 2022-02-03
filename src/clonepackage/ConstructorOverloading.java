package clonepackage;

import java.util.Scanner;

public class ConstructorOverloading {
	int id,age;
	String s;
	ConstructorOverloading(String n,int i)
	{
		s=n;
		id=i;
		//System.out.println("Name :"+s+"\nId :"+id);
	}
	ConstructorOverloading(String n, int i, int a)
	{
		s=n;
		id=i;
		age=a;
		//System.out.println("Name :"+s+"\nId :"+id+"\nAge :"+age);
		
	}
	void Display()
	{
		System.out.println("Name :"+s+"\nId :"+id+"\nAge :"+age);
	}

	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Name :");
		String s=in.next();
		System.out.println("Enter the Id :");
		int id=in.nextInt();
		System.out.println("Enter the Age :");
		int age=in.nextInt();
		ConstructorOverloading c= new ConstructorOverloading(s,id);
		ConstructorOverloading c1= new ConstructorOverloading(s,id,age);
		c.Display();  // assign 0 to age when the value is not passed
		c1.Display();

	}

}
