package SuperKeyword;

public class SuperMethodChild extends SuperMethod {

	public static void main(String[] args) {
		SuperMethodChild obj = new SuperMethodChild();
		obj.display();

	}
	
	public void display()
	{
		System.out.println("This is Super Child");
		super.show(); //parent class method
	}
}
