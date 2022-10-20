import java.io.*;
import java.util.*;
class reduce
{
  public static void main(String arg[])
 {
   try
  {
     Scanner sc=new Scanner(System.in);
     int n,s=0;
     System.out.println("Enter the number:");
     n=sc.nextInt();
     while(n>0)
     {
        if(n%2==0)
        {
          n=n/2;
        }
        else
        {
           n--;
        }
        s++;
   }
   System.out.println("The number of steps:"+s);
  }
  catch(Exception e)
  {
    System.out.println("Due to string exception");
  }
}
}
