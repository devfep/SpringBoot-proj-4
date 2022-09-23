import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    boolean isCorrectGuess = false;
    int guess;
    int increment;
    Scanner input = new Scanner(System.in);



    public GuessingGame(){
        guess = 0;
        increment = 0;
    }

    public void startGame(){
        System.out.println("Hello User, What is your name?");
        String name = input.nextLine();

        System.out.println("Welcome " + name + ", I'm thinking of a number between 1 and 100. Take a guess");
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);

        while (true){
            increment++;
            try {
                guess = input.nextInt();
            } catch (Exception e){
                System.out.println(e.getMessage());
                continue;
            }
            if (guess > 100 || guess < 1){
                System.out.println("Your guess is out of range. Please try again.");
            } else if ( guess > randomNumber) {
                System.out.println("Your guess is too high. Please try again.");
            } else if ( guess < randomNumber){
                System.out.println("Your guess is too low. Please try again.");
            } else {
                System.out.println("Well done, " + name + "! You found my number in " + increment + " tries");
                isCorrectGuess = true;
                break;
            }

        }

    }

}
