import java.util.*;
import java.util.Scanner;

public class Nsum {
	
	static int digSum(int n)
	{
		int sum = 0;
                int num;
		while (n > 0 || sum > 9)
		{
			if (n == 0) {
				n = sum;
				sum = 0;
			}
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static void main(String argc[])
	{
          try{
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number : ");
         int a = sc.nextInt();
         System.out.print("Enter the nnumber : ");
         int n = sc.nextInt();
         String s=Integer.toString(n);
         if(s.length()>a || s.length()<a)
             {
             System.out.println("invalid");
              }
         else
           {
		
		System.out.println(digSum(n));
	}
} 
 catch(Exception e)
 {
 System.out.println("Invalid input");
 }
}}
