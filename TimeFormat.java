// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		String amPMStr = "";
		String status = "";
		// am or pm check using hours greater then 12 as pm and the reverse for am
		if (hours > 12)
		{
			amPMStr += (hours-12);
			status = "pm";
		}
		else
		{
			amPMStr += hours;
			status = "am";
		}
		// putting a leading 0 where needed (when the minutes are a single digit)
		if (minutes < 10)
			amPMStr+=":0"+minutes+" "+status;
		else
			amPMStr+=":"+minutes+" "+status;
		System.out.println("Converted time is: " + amPMStr);
	}
}