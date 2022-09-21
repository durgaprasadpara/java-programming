import java.util.*;
import java.util.Scanner;
public class fact
{
     public static void main(String []args)
     {
       try
         {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if(num<=0)
        {
         System.out.println("Invalid input"); 
         }
       else{
        int i=1,fact=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of the number: "+fact);
          } }
     catch(Exception e)
        {
       System.out.println("Invalid due to floating point");
        } 
     }   
}
