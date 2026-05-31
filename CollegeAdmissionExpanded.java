import java.util.Scanner;
import static java.lang.System.*; 
// this is happening automatically in other java modules

public class CollegeAdmissionExpanded
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(in);
        int math;

        //this is an ->  System()
        err.print("This is a error");
        out.println( "Welcome to the UT Austin College Admissions Interface!" );
        out.print( "Please enter your SAT math score (200800): " );
        math = keyboard.nextInt();

        out.print( "Admittance status: " );

        if ( math >= 790 )
        {
            out.print( "CERTAIN " );
        }
        else
        {
            if ( math >= 710 )
            {
                out.print( "SAFE " );`
            }
            else
            {
                if ( math >= 580 )
                {
                    out.print( "PROBABLE " );
                }
                else
                {
                    if ( math >= 500 )
                    {
                        out.print( "UNCERTAIN " );
                    }
                    else
                    {
                        if ( math >= 390 )
                        {
                            out.print( "UNLIKELY " );
                        }
                        else // below 390
                        {
                            out.print( "DENIED " );
                        }
                    }
                }
            }
        }
        out.println();
        keyboard.close();


    }
}