import java.util.*;
import java.util.Scanner;
public class str2
{
    public static void main(String[] args) 
    {
      String str;
        String str2; 
        String reverse="";
        Scanner s = new Scanner(System.in);
       System.out.print("Enter the strig:");
        str= s.nextLine();
         int length = str.length();
        System.out.print("Enter the choice:");
         str2= s.nextLine();
      switch (str2) 
        {
            case "1":
               System.out.print("string length=:"+length); 
        break;    
 
         case "2":
      String str3=str.toLowerCase();
      String str4=str.toUpperCase();
     System.out.print("lower =:"+str3); 
     System.out.print("upper =:"+str4); 
            break;
            case "3":
          String str7=str.toLowerCase();
           for (int i = 0; i < str.length(); i++) {
			if (str7.charAt(i) == 'a' || str7.charAt(i) == 'e' || str7.charAt(i) == 'i' || str7.charAt(i) == 'o'
					|| str7.charAt(i) == 'u') {
				  System.out.print("vowels=:"+ str7.charAt(i));
                             }
                     else if(str7.charAt(i)>='a' && str7.charAt(i)<='z'){
                                   System.out.print("consonants=:"+ str7.charAt(i));
                                                                 }
		}
            break;
 
            case "4":
             for ( int i = 0; i<1; i++ )  {
         reverse = reverse + str.charAt(length-1);}
         System.out.println("Reverse of the string: " + reverse);
            break;
        }
    }
}
