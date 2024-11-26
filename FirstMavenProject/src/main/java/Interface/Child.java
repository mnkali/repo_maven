package Interface;

public class Child implements Parent{

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
		System.out.println(obj.a);

	}
//Overriding the parent method	
public void display()
{
	System.out.println("Parent Interface");
}
}
