package CollectionClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		Set <String> s = new HashSet<String>();
		
		s.add("Blue");
		s.add("Yellow");
		s.add("Green");
		s.add("Red");
		System.out.println(s);
		
		System.out.println(s.contains("green"));
		System.out.println(s.remove("Yellow"));
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		
		
		 ArrayList <String> var = new ArrayList <String>();
		 var.add("Purple");
		 var.add("pink");
		var.addAll(s);
		System.out.println(var);
		
		var.containsAll(s);
		System.out.println(s);
		
		
		s.clear();
		System.out.println(s);
		
	}

}
