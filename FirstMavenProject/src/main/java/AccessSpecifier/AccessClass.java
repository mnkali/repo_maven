package AccessSpecifier;

public class AccessClass {

	private void privateMethod()
	{
		System.out.println("Private Method");
	}
	
	public void publicMethod()
	{
		System.out.println("Public Method");
	}
	
	protected void protectedMethod()
	{
		System.out.println("Protected Method");
	}
	
	void defaultMethod()
	{
		System.out.println("Default Method");
	}
	public static void main(String[] args) {
		AccessClass obj = new AccessClass();
		
		obj.privateMethod();
		obj.publicMethod();
		obj.protectedMethod();
		obj.defaultMethod();

	}

}
