package Inheritance;

public class HierarchicalChildOne extends HierarchicalParent {

	public static void main(String[] args) {
		HierarchicalChildOne obj1 = new HierarchicalChildOne();
		obj1.display1();
		obj1.display2();
	}
	
	public void display2()
	{
		System.out.println("Hierarchical Child One");
	}
}
