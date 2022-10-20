import java.util.*;
import java.util.Scanner;
public class stringoperations
{
    public static void main(String[] args) 
    {
      String str;
        String str2;
       String reverse=""; 
        Scanner s = new Scanner(System.in);
do
{
       System.out.print("Enter the strig:");
        str= s.nextLine();
         int length = str.length();
        System.out.print("Enter the choice:");
         str2= s.nextLine();
      switch (str2) 
        {
            case "1": 
      for ( int i = length - 1; i >= 0; i-- )  {
         reverse = reverse + str.charAt(i);}  
      if (str.equals(reverse))  
         System.out.println("Entered string is a palindrome.");  
      else  
         System.out.println("Entered string isn't a palindrome.");
        break;    
 
         case "2":
      for ( int i = length - 1; i >= 0; i-- )  {
         reverse = reverse + str.charAt(i);}
    System.out.println("Reverse of the string: " + reverse);
            break;
 
            case "3":
             String result="";
               for (int i = 0; i < str.length(); i++) {
        if(!result.contains(String.valueOf(str.charAt(i)))) {
            result += String.valueOf(str.charAt(i));
        }
    }
     System.out.println("after removing duplicates of the string: " + result);
            break;
 
            case "4":
            System.out.print("Day: Thursday");
            break;
        }}
while(str2=="1" || str2=="2"  || str2=="3");

    }
}
