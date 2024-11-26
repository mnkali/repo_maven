package MethodOverriding;

public class Child extends Parent{

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display(40,20);
	}
	
	public void display(int a, int b)
	{
		int dif = a - b;
		System.out.println("The difference is: "+dif);
		super.display(50,20);
	}
}