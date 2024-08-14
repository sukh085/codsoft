package codsoft;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	private static final int MAX_ATTEMPTS = 5;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean playAgain = true;
		int roundsWon = 0;
		int totalAttempts = 0;
		
	while (playAgain) {
			int numberToGuess = random.nextInt(100) + 1;
			int attempts = 0;
			boolean guessedCorrectly = false;
			
		System.out.println("/nNew round started! Guess the number between 1 and 100.");
			while (attempts < MAX_ATTEMPTS && !guessedCorrectly) {
				System.out.print("Enter your guess: ");
				int userGuess = scanner.nextInt();
				attempts++;
				totalAttempts++;
				
			if (userGuess < numberToGuess) {
				System.out.println("Too low!");
			}else if (userGuess > numberToGuess) {
				System.out.println("Too high!");
			}else {
				System.out.println("Correcct! You've guessed the number.");
				guessedCorrectly = true;
				roundsWon++;
	
	if (!guessedCorrectly) {
       	System.out.println("You've used all attempts. The correct number was: ");
					}
					
		System.out.println("Total attempts: " + totalAttempts);
		System.out.println("Rounds won: " + roundsWon);
		
		System.out.print("Do you want to play again? (yes/no: ");
		String response = scanner.next();
		playAgain = response.equalsIgnoreCase("yes");
			}
			
			System.out.println("Thank you for playing! Final score: ");
			System.out.println("Rounds won: " + roundsWon);
			System.out.println("Total attempts:  " + totalAttempts);
			
			scanner.close();
				
					}
			}
			
		}

	}


