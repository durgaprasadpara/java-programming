import java.util.Scanner;
public class username 
{
    public static void main(String args[])
    {
        String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");
        username = s.nextLine();
        System.out.print("Enter password:");
        password = s.nextLine();
        if(username.equals(password))
        {
            System.out.println("Authentication Successful");
        }
        else
        {
            System.out.println("Authentication Failed");
        }
    }
}
