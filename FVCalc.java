// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		double years = Double.parseDouble(args[2]);	
		/*  the function I use to calculate the interest is the pow built-in function
		it takes two doubles as per the documentations*/
		double futureValue = currentValue * Math.pow(1+rate/100, years);
		/* simple casting and string formatting 
		*(there are multiple ways I just chose this one
		to each their own)*/
		System.out.println("After " +(int) years+ " years, "+currentValue+
			"$ saved at "+rate+"% will yield " +((int) futureValue-currentValue)+ "$");
	}
}