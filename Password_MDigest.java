import java.util.Scanner;
import java.security.MessageDigest;

public class Password_MDigest
{
    public static void main(String[] args) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);

        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        System.out.print("Password: ");
        String pw = keyboard.nextLine();

        digest.update(pw.getBytes("UTF-8"));

        byte[] bytes = digest.digest();

        StringBuilder hash = new StringBuilder();
        for (byte b : bytes)
        {
            hash.append(String.format("%02X", b));
        }

        System.out.println(hash);
    }
}