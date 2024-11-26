package SuperKeyword;

public class SuperInstanceChild extends SuperInstance{
	
	String place = "Kakkanad";
	public static void main(String[] args) {
		
		SuperInstanceChild obj = new SuperInstanceChild();
		obj.display();
		
	}
	
	public void display()
	{
		System.out.println("Name is: "+super.name);
		System.out.println("Place is: "+place);
	}
}
