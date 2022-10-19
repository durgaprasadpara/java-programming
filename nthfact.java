import java.util.*;
public class nthfact
{
public static void main(String[] args)
{
try
   {
int num,n;
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number : ");
num = sc.nextInt();
System.out.println("Enter N:");
n= sc.nextInt();
int i, count = 0;
for(i = 1; i <= num; i++)
{
if(num % i == 0)
{
count = count + 1;
if(count==n)
{
    System.out.println(n+" Factor is "+i);
}
}
}
if(count<n)
{
System.out.println("Invalid");
}
System.out.print("\nTotal factors of " + num + " : " + count);
}
  catch(Exception e)
     {
   System.out.println("Invalid");
     }

}
}
