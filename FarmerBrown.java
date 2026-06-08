public class FarmerBrown
{
    public static void main( String[] args )
    {
        for ( int s = 1 ; s <= 5 ; s++ )
        {
            System.out.println("This is top loop " + s);
            for ( int g = 1 ; g <= 5 ; g++ )
            {
                System.out.println("This is second loop " + g);

                for ( int c = 1 ; c <= 5 ; c++ )
                {
                    System.out.println("This is inner loop " + g);
                    if ( s+g+c == 100 && 10.00*s + 3.50*g + 0.50*c == 100.00 )
                        //  the total no.of animals == total amount spent 
                    {
                        System.out.print( s + " sheep, " );
                        System.out.print( g + " goats, and " );
                        System.out.println( c + " chickens." );
                    }
                    // break;
                }
            }
        }
    }
}