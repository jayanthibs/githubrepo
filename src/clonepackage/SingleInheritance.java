package clonepackage;
 class Parent{  // one source(.java) file should have only one public class, if you want to make any class as public then it should be in its own .java source file 
	int a=10,b=20;
	void print()
	{
		System.out.println("a="+a+"\n"+"b="+b);
	}
	Parent(){
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent{
	int c=30;
	void show()
	{
		System.out.println("c="+c);
	}
	Child(){
		System.out.println("Child onstructor");
	}

}

public class SingleInheritance{

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		c.print();
		c.show();
		
		

	}

}
