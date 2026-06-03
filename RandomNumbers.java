public class RandomNumbers
{
    public static void main( String[] args )
{
     {
         int a, b, c;
         double x, y, z;
 
         x = Math.random();
         y = Math.random();
         z = Math.random();
        //  Math.random creates random decimal numbers in the range 0.0<value<0.9999 
        //  it won't be 1.0 or above
        // here Math is the class and random() will be the method 

         System.out.println( "x is " + x );
         System.out.println( "y is " + y );
         System.out.println( "z is " + z );
 
         x = Math.random() * 100;
         y = Math.random() * 100;
         z = Math.random() * 100;
 
         System.out.println( "\nx is " + x );
         System.out.println( "y is " + y );
         System.out.println( "z is " + z );
 
         a = (int)x;
         b = (int)y;
         c = (int)z;
 
         System.out.println( "\na is " + a );
         System.out.println( "b is " + b );
         System.out.println( "c is " + c );
 
         x = 0.9999999999999999;
         a = (int)(x * 100);
 
         System.out.println( "\nx is " + x );
         System.out.println( "a is " + a );
 
         x = Math.random();
         System.out.println(x);
         a = 0 + (int)(x*10);
         b = 1 + (int)(x*10);
         c = 5 + (int)(x*10);
 
         System.out.println( "\na is " + a );
         System.out.println( "b is " + b );
         System.out.println( "c is " + c );
     }
 } {
//   When you multiply math.random with any number the range
// lies btw the 0 and that number
}
}