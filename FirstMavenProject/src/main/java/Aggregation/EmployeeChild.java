package Aggregation;

public class EmployeeChild {

	String name;
	String address;
	String phone;
	
	Employee refvar; // Reference variable for Parent Class
	
	public EmployeeChild(String name,String address,String phone,Employee refvar) // Constructor
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
		
		this.refvar = refvar;
	}
	
	public void showEmployee()
	{
		System.out.println("------Employee Child Class-----");
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Phone: "+phone);
		
		System.out.println("------Employee Parent Class-----");
		System.out.println("Name: "+refvar.name);
		System.out.println("Dept: "+refvar.dept);
		System.out.println("Emp COde: "+refvar.empcode);
		
		
	}
	
	public static void main(String[] args) {
		Employee object = new Employee("Mohseen","IT",1234); //Parent class object
		EmployeeChild obj = new EmployeeChild("Mohseen","Ernakulam","9633596928",object);
		
		obj.showEmployee();

	}

}