import java.util.Scanner;
class digit
{
public static void main(String arg[])
{
try
{
int m, n,sum,n1,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number ");
n=sc.nextInt();
int n2=n;
while(n2>0)
{
   n1=n%10;
   c++;
   n2=n2/10;
   
}
System.out.println("Digits:"+c);
}
catch(Exception e)
{
   System.out.println("Due to character exception");
}

}
}
