// Splits a restaurant bill evenly among three diners.

public class Bill3 {
	public static void main(String[] args) {
		// args from command line that I used as vars
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		// I converted the arg to integer and did a decimal division and rounding
		double billPerPerson =  Integer.parseInt(args[3]) / 3.0;
		billPerPerson = Math.ceil(billPerPerson);
	    System.out.println("Dear " + name1 +", "+ name2 + " and " +name3+": pay " + 
			billPerPerson + " ILS each");
	}
}
