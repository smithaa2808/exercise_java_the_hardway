import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class LowestTemperatureLocal
{
    public static void main(String[] args) throws Exception
    {
        double[] temps;
        double lowest = 9999.99;

        // Read values from file
        Scanner fin = new Scanner(new File("avg-daily-temps-atx.txt"));
        temps = new double[fin.nextInt()];  
        // You have to be curious to understand what is inside this variable
        // System.out.println(temps.);
        System.out.println( temps.length + " temperatures in database.");

        for ( int i=0; i<temps.length; i++ )
            temps[i] = fin.nextDouble();
        fin.close();
        // I want to print the array temps values
        // went
        // System.out.println(Arrays.toString(temps));   
        for ( int i=0; i<temps.length; i++ ){
            if ( temps[i] < lowest )
                lowest = temps[i];

            // if ( temps[i] > lowest)
            //     System.out.println("You don't want this to be printed " + temps[i]);
        }
        System.out.print( "The lowest average daily temperature was " );
        System.out.println( lowest + "F (" + fToC(lowest) + "C)" );
    }

    public static double fToC( double f ) { return (f-32)*5/9; }
}
