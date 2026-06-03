import java.util.Scanner;

public class KeepGuessing
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        int secret, guess;

        secret = 1 + (int)(Math.random()*10);
        System.out.println(secret);

        System.out.println( "I have chosen a number between 1 and 10. Try to guess it." );
        System.out.print( "Your guess: " );
        guess = keyboard.nextInt();

        while ( secret != guess )
        {
            System.out.println( "That is incorrect. Guess again." );
            System.out.print( "Your guess: " );
            // guess = keyboard.nextInt(); // This input will complete after pressing enter
            try {
                Thread.sleep(500); // Sleep for 1000 ms = 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println( "That's right! You're a good guesser." );
    }
}