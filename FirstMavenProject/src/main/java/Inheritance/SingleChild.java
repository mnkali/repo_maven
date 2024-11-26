package Inheritance;

public class SingleChild extends SingleParent
{

	public static void main(String[] args)
	{
		SingleChild obj = new SingleChild();
		obj.display();
		obj.display2();
	}
	
	public void display2()
	{
		System.out.println("Child Class");
	}
}
