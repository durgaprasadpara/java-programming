import java.util.*;
import java.util.Scanner;
class steps
{
public static void main(String[] args)
{
try
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int n = sc.nextInt();
int a;
int count=0;
while(n>0)
{
  if(n%2==0)
    {
     a=n/2;
     }
   else
   {
    a=n-1;
   }
  count=count+1;
   n=a;
}
System.out.println("no of steps:" +count);
}
catch(Exception e)
{
System.out.println("invalid input");
}
}
}
