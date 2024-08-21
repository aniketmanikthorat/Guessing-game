import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int maxTries = 5;
        boolean hasGuessedCorrectly = false;

        System.out.println("Guess a number between 1 and 100:");

        while (numberOfTries < maxTries) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess == numberToGuess) {
                hasGuessedCorrectly = true;
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
        } else {
            System.out.println("Sorry! You've used all your tries. The number was " + numberToGuess + ".");
        }
    }
}

