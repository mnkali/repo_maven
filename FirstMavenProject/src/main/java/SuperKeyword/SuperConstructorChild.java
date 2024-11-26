package SuperKeyword;

public class SuperConstructorChild extends SuperConstructor{

	public SuperConstructorChild()
	{
		super(10,20);
		System.out.println("Child class constructor");
		
	}
	public static void main(String[] args) {
		SuperConstructorChild obj = new SuperConstructorChild();
				
	}

}
