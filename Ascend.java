// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		/*  defining 3 variables to random values in the range of 0 - 10000
		Not including 10000*/
		int a = (int)(Math.random() * 10000);
		int b = (int)(Math.random() * 10000);
		int c = (int)(Math.random() * 10000);
		/*  creating 3 parameters that will be used later on
		and initialising them to existing values*/
		int biggest = a;
		int middle = b;
		int smallest = c;
		// nested Max operation to get the biggest of all numbers
		biggest = Math.max(a, Math.max(b,c));
		// same thing but in reverse using the Min operation to get the smallest number
		smallest = Math.min(a, Math.min(b,c));
		/* extracting the middle value from the sum of the original 3 and the substraction
		of the other 2*/
		middle = a + b + c - biggest - smallest;
		System.out.println(a+", " +b+", "+c);
		System.out.println(smallest+", " +middle+", "+biggest);
		
		

	}
}
