import java.util.Scanner; //necessary for reading keyboard input
/**
 * Write a description of class Lab2a here.
 * 
 * @author Ian Bryan
 * @version v1
 */
public class Lab2a {
	/**
	 * Part 1 - kelvins method  - takes as argument a double corresponding to
	 * degrees Fahrenheit, then returns a double corresponding to the
	 * same input temperature in degrees Kelvin.
	 */
	public static double kelvins(double fah) {
		double kel = (fah + 459.67) * 5/9;
		return kel; 
	}

	/**
	 * Part 2 - temperaturePrinter method - takes as arguments two doubles. The
	 * first is a temperature in degrees Fahrenheit and the second is the
	 * same temperature in degrees Kelvin. This method is void and it 
	 * prints to the screen:
	 * 
	 * <arg1> F corresponds to <arg2> K
	 */

	public static void temperaturePrinter(double fah, double kel){
		System.out.println("Degrees Fahrenheit: "+fah);
		System.out.println("Degress Kelvin: "+kel);
	}

	/**
	 * Part 3 - secondTime method - write a clear and concise description for 
	 * this method here:
	 */
	public static void secondTime(int seconds) {
		int secsExtra = 0;
		int mins = seconds/60;
		int hrs = mins/60;
		secsExtra = mins / seconds;
		System.out.println(seconds+" seconds is equal to: "+hrs+" hours and "+mins+" minutes, and "+secsExtra+" seconds");
	}

	/**
	 * Part 3 - inSeconds method - takes as arguments three integers: hours, 
	 * minutes and seconds, computes the exact time in seconds, then returns 
	 * the total number of seconds and prints a message to the screen.
	 */

	public static void timeInSecondsTotal(int hrs, int mins, int seconds){


	}

	public static void main(String[] args) {

		/*
		 * Part 1 - Arithmetic order or precedence in Java
		 */

		int result1 = (7 * 3) % 4 - (2 * 6) / 5 + 10 / (3 / 2);
		int result2 = 2 / (4 - 3) + ((5 * 4 % 3 * 5 - 6) * 2) - 5;
		int i = 10;
		int j = 20; 
		int k; 
		k = ++i - j--;
		System.out.println("Result1: "+result1+"\n"+"Result2: "+result2+"\n"+"K: "+k);

		//Tests for Part 1:

		double fah = 32;
		double kel = kelvins(fah);

		Lab2a.temperaturePrinter(fah, kel);

		// Tests for part 2:
		// your code goes here

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a total number of seconds");
		int seconds = in.nextInt();

		//Tests for Part 3 (d):
		Lab2a.secondTime(seconds);

		double maxNumber1 = Math.max(22.3, 34.5);
		double minNumber1 = Math.min(3.6/7.2, 3.8/6.9);
		double maxNumber2 = Math.max(2/3, 0.1);
		double minNumber2 = Math.min(13.5555, 13.5556);

		System.out.println(maxNumber1+" : "+minNumber1+" : "+maxNumber2+" : "+minNumber2);
		System.out.println("Enter name and three numbers, separate by space");
		String userInput = in.next();
		String[] inputArray = userInput.split(" ");
		double maxNumber3 = Math.max(Double.parseDouble(inputArray[1]), Double.parseDouble(inputArray[2]));
		double maxNumber4 = Math.max(Double.parseDouble(inputArray[1]), Double.parseDouble(inputArray[3]));
		System.out.println(inputArray[0] + ": The three numbers in descending order are as follows"+maxNumber4+maxNumber3);
	}
}
