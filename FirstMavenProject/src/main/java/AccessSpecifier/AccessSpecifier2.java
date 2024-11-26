package AccessSpecifier;

public class AccessSpecifier2 extends AccessClass{

	public static void main(String[] args) {
		AccessSpecifier2 object = new AccessSpecifier2();
		
		//object.privateMethod(); its a private class in the parent class. So we dont't have access here
		object.publicMethod();
		object.protectedMethod();
		object.defaultMethod();

	}

}
