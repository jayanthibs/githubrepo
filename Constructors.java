package objectclasspractice;
//This is default and parameterized constructors
public class Constructors {
	int a=10;
	int b=20,c;
	Constructors()
	{
		c=a*b;
	}
	Constructors(int i,int j)
	{
		a=i;
		b=j;
		c=a*b;
		//System.out.println("The value of C: "+c);
	}
	void print()
	{
		System.out.println("The value of C: "+c);
	}

	public static void main(String[] args) {
		Constructors c= new Constructors();  //default constructor is invoked at the time of object creation
		c.print();
		Constructors c1= new Constructors(5,10);  // Parameterized constructors
		c1.print();

	}

}
