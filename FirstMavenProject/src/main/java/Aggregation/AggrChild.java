package Aggregation;

public class AggrChild {

	String name;
	String model;
	int year;
	
	AggrParent refvar; // Reference variable for Parent Class
	
	public AggrChild(String name,String model,int year,AggrParent refvar) // Constructor
	{
		this.name = name;
		this.model = model;
		this.year = year;
		
		this.refvar = refvar;
	}
	
	public void display()
	{
		System.out.println("------Child Class-----");
		System.out.println("Name: "+name);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
		
		System.out.println("------Parent Class-----");
		System.out.println("Name: "+refvar.name);
		System.out.println("Model: "+refvar.city);
		System.out.println("Year: "+refvar.state);
		System.out.println("Pincode: "+refvar.pincode);
		
	}
	
	public static void main(String[] args) {
		AggrParent object = new AggrParent("Mohseen","ERN","KL",682030); //Parent class object
		AggrChild obj = new AggrChild("Honda","Amaze",2015,object);
		
		obj.display();

	}

}
