package Collection;

import java.util.ArrayList;
import java.util.List;

public class GenericCollection {

	public static void main(String[] args) {
		List <String> li = new ArrayList <String>(); // Creating reference for interface. Can't create object for interface
		li.add("Blue");
		li.add("Yellow");
		li.add("Green");
		li.add("Red");
		
		System.out.println(li);
		
		li.set(1,"Orange"); //modify the list interface
		System.out.println(li);
		
		System.out.println(li.indexOf("Red")); //get the index value in the list
		System.out.println(li.lastIndexOf("Blue")); //getthe last occurance  of repeated items
		
		li.remove(1); //remove the value from index
		System.out.println(li.indexOf(li));
		
		li.get(2); //get the value at the index
		System.out.println(li);
		
		System.out.println(li.contains("Pink")); //check the value in list
		System.out.println(li.contains("Green"));
		
		System.out.println(li.isEmpty());//checks the list empty or not
		
		if(li.isEmpty())
		{
			System.out.println("Empty");
		} else {
			System.out.println("Not empty");
		}
		
		System.out.println(li.size());	
		
		//for(int i=0;i < li.size(); i++)
		//{
		//	System.out.println(li.get(i));
		//}
		
		for(String var:li) //foreach
		{
			System.out.println(var);
		}
		
	}

}
