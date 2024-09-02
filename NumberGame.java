import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int rounds = 0;
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean correct = false;

            while (!correct && attempts < 6) {
                System.out.print("Guess a number between 1 and 100: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Correct! You found the number in " + attempts + " attempts.");
                    score += 10 - attempts;
                    correct = true;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!correct) {
                System.out.println("Sorry, you didn't find the number. It was " + numberToGuess + ".");
            }

            rounds++;
            System.out.println("Your score: " + score);
            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing! Your final score is " + score + " in " + rounds + " rounds.");
    }
}

