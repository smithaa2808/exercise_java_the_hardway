import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class LetterRevisitedException
{
    public static void main( String[] args )
    {
        PrintWriter fileout;

        try
        {
            fileout = new PrintWriter( new FileWriter("letter.txt") );
        }
        catch ( IOException err )
        {
            System.out.println("Sorry, I can't write to the file 'letter.txt'.");
            System.out.println("Maybe the file exists and is readonly?");
            fileout = null;
            System.exit(1);
        }

        fileout.println( "+ +" );
        fileout.println( "|                                                    #### |" );
        fileout.println( "|                                                    #### |" );
        fileout.println( "|                                                    #### |" );
        fileout.println( "|                                                         |" );
        fileout.println( "|                                                         |" );
        fileout.println( "|                              Bill Gates                 |" );
        fileout.println( "|                              1 Microsoft Way            |" );
        fileout.println( "|                              Redmond, WA 98104          |" );
        fileout.println( "|                                                         |" );
        fileout.println( "+ +" );
        fileout.close();
    }
}