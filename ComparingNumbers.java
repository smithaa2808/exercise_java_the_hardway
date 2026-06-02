import java.util.Scanner;

public class ComparingNumbers
{
    public static void main(String[] args)
{
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print("Give me two numbers.First: ");
    first = keyboard.nextDouble();
    System.out.print("Second");
    second = keyboard.nextDouble();
    String ex_string = " is LESS THAN ";
    // String testingInt = "first ";
    if (first < second )
    {
        System.out.println(first + ex_string + second);
    }
    if ( first <= second )
    {
        System.out.println(first+ "is LESS THAN or EQUAL TO " + second);
        //print(f"{first} is less than {second}")
    }
    if ( first == second)
    {
        System.out.println(first + "is EQUAL TO "+ second);
    }
    if ( first >= second)
    {
        System.out.println(first + "is GREATER THAN or EQUAL TO " +second);

    }
    if (first > second)
    {
        System.out.println(first+ "is GREATER THAN "+ second);
    }
    if (first != second)
    {
        System.err.println(first+ "is NOT EQUAL TO " + second);
    }

    keyboard.close();
}
}