import java.util.Scanner;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

public class PasswordDigest
{
    public static void main( String[] args ) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);

        String pw, hash;

        MessageDigest digest = MessageDigest.getInstance("SHA256");

        System.out.print("Password: ");
        pw = keyboard.nextLine();

        digest.update( pw.getBytes("UTF8") );
        hash = DatatypeConverter.printHexBinary( digest.digest() );

        System.out.println( hash );
    }
}