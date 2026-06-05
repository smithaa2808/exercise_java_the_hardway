public class ThereAndBackAgain 
// This is a module.. because the file name same as this name
{
    public static void main( String[] args )
    {
        System.out.println( "Here." );
        erebor();
       //  erebor is a  method 
        System.out.println( "Back first time." );
        erebor();
        System.out.println( "Back second time." );

        // ThereAndBackAgain a1 = new ThereAndBackAgain();
        // cannot create object a1, because ThereAndBackAgain is a Module...
        // a1 will be ThereAndBackAgain Object
        // a1.erebor();  // here erebor is a method,
        erebor_01();

    }
     public static void erebor() // it has to be a function
    {
        System.out.println( "There." );
    }

     public static void erebor_01() 
    {
        System.out.println( "There... 01." );
    }
}