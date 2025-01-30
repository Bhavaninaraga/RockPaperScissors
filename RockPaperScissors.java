import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};

        System.out.println("Enter your choice (Rock, Paper, Scissors): ");
        String userChoice = scanner.nextLine().trim();
        userChoice = userChoice.substring(0, 1).toUpperCase() + userChoice.substring(1).toLowerCase();

        if (!userChoice.equals("Rock") && !userChoice.equals("Paper") && !userChoice.equals("Scissors")) {
            System.out.println("Invalid choice! Please choose Rock, Paper, or Scissors.");
        } else {
            int computerIndex = random.nextInt(3);
            String computerChoice = options[computerIndex];

            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a draw!");
            } else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                       (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                       (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
        
        scanner.close();
    }
}

