
import java.util.Random;

public class Main
{
    static void main()
    {
        Random rnd = new Random();
        String playAgain = "yes";

        // play game
        while (playAgain.equalsIgnoreCase("yes")
                || playAgain.equalsIgnoreCase("y")) //yes or y is accepted
        {
            // roll  dice
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println();
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + sum);

            // check the first roll
            if (sum == 2 || sum == 3 || sum == 12)
            {
                System.out.println("Craps, you lost.");
            }
            else if (sum == 7 || sum == 11)
            {
                System.out.println("natural, you won.");
            }
            else
            {
                int point = sum;
                System.out.println("the point is " + point);

                boolean gameOver = false;

                // keep rolling until the player wins or loses
                while (gameOver == false)
                {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    sum = die1 + die2;

                    System.out.println();
                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + sum);

                    if (sum == point)
                    {
                        System.out.println("made the point, you win.");
                        gameOver = true;
                    }
                    else if (sum == 7)
                    {
                        System.out.println("Got a seven, you lose.");
                        gameOver = true;
                    }
                    else
                    {
                        System.out.println("trying for point...");
                    }
                }
            }

            // Ask to play again
            playAgain = IO.readln("Play again? (yes/no): ");
        }

        System.out.println("thank you for playing!");
    }
}
