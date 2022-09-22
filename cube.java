import java.util.*;
public class cube {
    public static void main(String args[]) {
try
{
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.print("Enter an integer number: ");
        num = sc.nextDouble(); 
if(num<=0)
{
 System.out.println("Invalid");
}
else
{
        System.out.println("Square of " + num + " is: " + Math.pow(num, 2));
        System.out.println("Cube of " + num + " is: " + Math.pow(num, 3));
       }
}
   catch(Exception e)
     {
   System.out.println("Invalid");
       }
    }
}
