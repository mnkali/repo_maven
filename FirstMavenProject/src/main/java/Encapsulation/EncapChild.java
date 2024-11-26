package Encapsulation;

public class EncapChild {

	public static void main(String[] args) {
		EncapParent parentObj = new EncapParent();
		
		parentObj.setName("Raj");
		parentObj.setAge(25);
		
		System.out.println(parentObj.getName());
		System.out.println(parentObj.getAge());

	}

}
