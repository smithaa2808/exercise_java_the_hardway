    public class YachtDice    // YatchDice is a method
 {
     public static void main( String[] args )
     {
         int roll1, roll2, roll3, roll4, roll5;
         boolean allTheSame;
 
         do
         {
             roll1 = 1 + (int)(Math.random()*6);
             roll2 = 1 + (int)(Math.random()*6);
            //  roll3 = 1 + (int)(Math.random()*6);
            //  roll4 = 1 + (int)(Math.random()*6);
            //  roll5 = 1 + (int)(Math.random()*6);
            System.out.println("\nYou rolled: " + roll1 + " " + roll2 );
            // System.out.println("\nYou rolled: " + roll1 + " " + roll2 + " " + roll3 + " " + roll4 + " " + roll5);
             showDice(roll1);
             showDice(roll2);
            //  showDice(roll3);
            //  showDice(roll4);
            //  showDice(roll5);
             allTheSame = ( roll1 == roll2 );
            //  allTheSame = ( roll1 == roll2 && roll2 == roll3 && roll3 == roll4 && roll4 == roll5 );
 
         } while ( ! allTheSame ); // (! =  opposite condition)
        //   roll1 = roll2 = 6  the condition for allTheSame will be true but here the 
        //  while condition is not true  that is false so the loop stops  whn roll1=roll2 
         System.out.println("The Yacht!!");
     }
 
     public static void showDice( int roll ) //showDice is  a function and roll is a parameter
     {
         System.out.println("+ +");
         if ( roll == 1 )
         {
             System.out.println("|   |");
             System.out.println("| o |");
             System.out.println("|   |");
         }
         else if ( roll == 2 )
         {
             System.out.println("|o  |");
             System.out.println("|   |");
             System.out.println("|  o|");
         }
         else if ( roll == 3 )
         {
             System.out.println("|o  |");
             System.out.println("| o |");
             System.out.println("|  o|");
         }
         else if ( roll == 4 )
         {
             System.out.println("|o o|");
             System.out.println("|   |");
             System.out.println("|o o|");
         }
         else if ( roll == 5 )
         {
             System.out.println("|o o|");
             System.out.println("| o |");
             System.out.println("|o o|");
         }
         else if ( roll == 6 )
         {
             System.out.println("|o o|");
             System.out.println("|o o|");
             System.out.println("|o o|");
         }
         System.out.println("+ +");
     }
 }
