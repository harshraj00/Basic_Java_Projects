import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors2 {
    public static void main(String[] args) {

        String[] options = { "rock", "paper", "scissors" };

        Scanner sc = new Scanner(System.in);
        System.out.println("<<Welcome to Rock Paper & Scissors>>");
        System.out.print("Enter your Choice(rock / paper / scissors): ");
        String userinput = sc.next();

        Random rand = new Random();
        String computerinput = options[rand.nextInt(3)];

        System.out.println("Computer Choice: " + computerinput);

        if (userinput.equals(computerinput)) {
            System.out.println("It's a Draw!");
        }

        else if (userinput.equals("rock") && computerinput.equals("scissors") ||
                userinput.equals("paper") && computerinput.equals("rock")||
                userinput.equals("Scissors") && computerinput.equals("paper"))
                {
                    System.out.println("You Win!");
                }
        else {
            System.out.println("Computer Wins!");
            sc.close();
        }

    }

}
