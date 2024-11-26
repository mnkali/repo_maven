package MultipleInheritance;

public class ChildClass implements Parent1, Parent2 {

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.print1();
		obj.print2();

	}
	public void print1()
	{
		System.out.println("Parent 1");
	}
	
	public void print2()
	{
		System.out.println("Parent 2");
	}
}
