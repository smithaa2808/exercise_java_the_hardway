import java.util.Scanner;
 
 public class PigDiceComputer
 {
     public static void main( String[] args )
     {
         Scanner keyboard = new Scanner(System.in);
 
         int roll, total;
 
         total = 0;
        //   When you multiply math.random with any number the range
        // lies btw the 0 and that (number - 1)
         do
         {  
            Integer random_num = (int)(Math.random()*6); // this will be first stmt to execute
            // random_num = 0
             // System.out.println(random_num);
             roll = 1 + random_num;
             System.out.println( "Computer rolled a " + roll + "." );
             if ( roll == 1 )
             {
                 System.out.println( "\tThat ends its turn." );
                 total = 0;
             }
             else
             {
                 total += roll; // total is 1
                 System.out.println( "\tComputer has " + total + " points so far this round." );
                 if ( total < 20 )
                 {
                     System.out.println( "\tComputer chooses to roll again." );
                 }
             }
         } while ( roll != 1 && total < 20 );
         //       true && false
 
         System.out.println( "Computer ends the round with " + total + " points." );
         
         keyboard.close();
     }

 }