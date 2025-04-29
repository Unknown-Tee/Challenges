package Challenges;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1; // number between 1 and 100
        int guess = 0;
        int attempts = 0;

        System.out.println(" Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            
            // Input validation
            if (!scanner.hasNextInt()) {
                System.out.println(" Please enter a valid number!");
                scanner.next(); // skip invalid input
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess < 1 || guess > 100) {
                System.out.println(" Please guess a number between 1 and 100.");
            } else if (guess < secretNumber) {
                System.out.println(" Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println(" Too high! Try again.");
            } else {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
