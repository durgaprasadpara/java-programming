import java.io.*;
import java.util.*;
class inverted
{
  public static void main(String args[])
  {
  int n,i,j;
  char c;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no.of.rows:");
  n=sc.nextInt();
  System.out.println("Enter any character:");
  c=sc.next().charAt(0);
  for(i=n;i>-1;i--)
  {
    for(j=1;j<=i;j++)
    {
      System.out.print(c+" ");
    }
    System.out.println();
   }
 }
}
