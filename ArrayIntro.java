public class ArrayIntro
{
    public static void main( String[] args )
    {
        String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn",  "Uranus",  "Neptune" };
        // creating array named as planet 
 
        for ( String p : planets ) // For each String in the planets array, store it in variable p
        {
            System.out.println( p + "\t" + p.toUpperCase() );
            //  toUpperCase will change p to Capitals 
        }
    }
}
//  for(String p : planets )
//  p = Mercury 
//  Mercury  MERCURY 
//  p = Venus 
//  Venus VENUS
