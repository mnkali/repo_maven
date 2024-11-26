package Collection;

import java.util.ArrayList;
import java.util.List;

public class NonGeneric {

	public static void main(String[] args) {
		List var = new ArrayList();
		
		var.add("Blue");
		var.add("Yellow");
		var.add("Green");
		var.add("Red");
		
		System.out.println(var);
		
		var.set(1,"Orange"); //modify the list interface
		System.out.println(var);
	}

}
