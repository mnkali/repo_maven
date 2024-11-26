package CollectionClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		 ArrayList <String> obj = new ArrayList <String>();
		 
	 obj.add("Blue");
	 obj.add("Yellow");
	 obj.add("Green");
	 obj.add("Red");
			
	System.out.println(obj);
	
	
	 ArrayList <String> var = new ArrayList <String>();
	 var.add("Purple");
	 var.add("pink");
	 
	 System.out.println(var);
	 
	 System.out.println(obj.addAll(var));
	 System.out.println(obj);
	 
	 obj.set(0,"Magenta");
	 System.out.println(obj);
	 
	 
	 Iterator itr = obj.iterator();
	 
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	 
	 itr.remove(); // remove last element
	 System.out.println(obj);
	}

}
