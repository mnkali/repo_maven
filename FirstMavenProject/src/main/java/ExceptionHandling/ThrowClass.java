package ExceptionHandling;

public class ThrowClass {

	public static void main(String[] args) {
		int age = 17;
		if(age >= 18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("Not Eligible"); //Throws an arithmatic exception
		}

	}

}
