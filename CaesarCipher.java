import java.util.Scanner;
 
public class CaesarCipher
{
    /**
     * Returns the character shifted by the given number of letters.
     */
    public static char shiftLetter( char c, int n )
    {
        int ch = c; // This will convert the char to its unicode integer 
        System.out.println("ch value: " + ch);
        if ( ! Character.isLetter(c) )
            return c;
         ch = ch + n;
         System.out.println("After adding n " + ch);
        if ( Character.isUpperCase(c) && ch > 'Z' || Character.isLowerCase(c) && ch > 'z' )
            ch -= 26;
        if ( Character.isUpperCase(c) && ch < 'A' || Character.isLowerCase(c) && ch < 'a' )
            ch += 26;
        // System.out.println("After conditions ch is "+ch);
        // System.out.println("After typecasting to char "+(char)ch);
         return (char)ch;
        
    }
     public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        String plaintext, cipher = ""; // empty string 

        int shift;
         System.out.print("Message: ");
        plaintext = keyboard.nextLine();
        System.out.print("Shift (0-26): ");
        shift = keyboard.nextInt();
         for ( int i=0; i<plaintext.length(); i++ )
        {
            cipher += shiftLetter( plaintext.charAt(i), shift );
            //  charAt(1) it will give the corresponding element of the given index 
            
        }
        System.out.println( cipher );
     }
}