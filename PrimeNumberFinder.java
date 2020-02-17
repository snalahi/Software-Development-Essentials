public class PrimeNumberFinder{
	public static void main(String[] args) {
		int number = 0;
		if (args.length == 0) {
			System.out.println("No Argument Supplied");
			System.exit(-1);
		} else {
			try {
				number = Integer.parseInt(args[0]);
			}
			catch (NumberFormatException nfe) {
				System.out.print("Sorry! bad input. Please insert an integer number: ");
				System.exit (-1);
			}
			
		}
		if (number%2 == 1) {
			System.out.println(number + " " + "is a prime number");
		} else {
			System.out.print(number + " " + "is not a prime number");
		}
	}
}