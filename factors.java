import java.util.*;
public class factors
{
public static void main(String[] args)
{
try
   {
int num,n,i;
int count=0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number : ");
num = sc.nextInt();
if(num<=0)
{
  System.out.print("invalid input");
}
else{
for(i = 1; i <= num; i++)
{
if(num % i == 0)
{
count = count + 1;
}
}
System.out.print("\nTotal factors of " + num + " : " + count);
}
}
  catch(Exception e)
     {
   System.out.println("Invalid due to floating point");
     }
}
}
