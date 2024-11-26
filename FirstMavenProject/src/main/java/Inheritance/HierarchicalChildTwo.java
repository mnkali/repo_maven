package Inheritance;

public class HierarchicalChildTwo extends HierarchicalParent {

	public static void main(String[] args) {
		HierarchicalChildTwo obj2 = new HierarchicalChildTwo();
		obj2.display1();
		obj2.display3();
	}
	
	public void display3()
	{
		System.out.println("Hierarchical Child Two");
	}
}
