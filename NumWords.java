// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    

		int number = Integer.parseInt(args[0]);
		// this specifically just counts all the hundreds by ignoring the remainder
		String hundreds = number/100+" hundreds";

		/* the division due to it being an integer operation gets rid of the unit digit 
		and leaves only the tens digit*/
		String tens = (number%100)/10+" tens";
		
		// leaves only the tens and units thus by modulo of 10 we get just the units
		String units = (number%100)%10+" ones.";
		System.out.println(hundreds+", "+tens+", and"+units);
		
	}
}
