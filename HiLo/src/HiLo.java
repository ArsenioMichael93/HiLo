import java.util.Scanner;

public class HiLo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		do {
		// Create a random number for the user to guess
		int theNumber = (int)(Math.random() * 20 + 1);
		// System.out.println( theNumber );
		int guess = 0;
		int numberOfTries = 0;
		while (guess != theNumber) {
			System.out.println("Guess a number between 1 and 20");
			guess = scan.nextInt();
			numberOfTries = numberOfTries +1;
			if (guess < theNumber)
				System.out.println(guess + " is too low. Try again");
			else if (guess > theNumber)
				System.out.println(guess + " is too High. Try again");
			else {
				System.out.println(guess + " is correct. You win!");
				System.out.println("You guessed " + numberOfTries + " times. Good job!");
			}
		}	//End of while loop for guessing
				System.out.println("Would you l(y/n)?");
				playAgain = scan.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Goodbye!.");
		scan.close();
	}
}