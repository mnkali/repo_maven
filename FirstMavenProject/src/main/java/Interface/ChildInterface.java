package Interface;

public class ChildInterface implements ParentInterface {

	public static void main(String[] args) {
		
		ParentInterface obj = new ChildInterface();//Reference
		obj.show();
		//obj.display(); //Can't invoke. Because obj is parentreference

	}
	
	public void show()
	{
		System.out.println("Parent Interface");
	}
	
	public void display()
	{
		System.out.println("Child");
	}
	
	
}
