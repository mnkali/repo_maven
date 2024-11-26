package AccessSpecifier2;
import AccessSpecifier.AccessClass;//Package name.class name

public class Access2Class extends AccessClass{

	public static void main(String[] args) {
		
		Access2Class obj = new Access2Class();
		
		//obj.privateMethod(); //its a private class in the parent class. So we dont't have access here
		//obj.defaultMethod(); ////its a protected class in the parent class. So we dont't have access here
		obj.publicMethod();
		obj.protectedMethod();
		
	}

}
