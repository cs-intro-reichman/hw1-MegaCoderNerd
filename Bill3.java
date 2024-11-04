// Splits a restaurant bill evenly among three diners.

public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		// I used ceiling method to round up the bill division to the nearest integer
		// I divided an integer by a double in order for the product to be a double
		double billPerPerson =  Math.ceil(Integer.parseInt(args[3]) / 3.0);
	    System.out.println("Dear " + name1 +", "+ name2 + " and " +name3+": pay " + 
			billPerPerson + " ILS each");
	}
}
