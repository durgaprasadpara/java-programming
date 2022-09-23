import java.util.Scanner;
class rootsqt
{
public static void main(String[] args)
{
System.out.print("Enter a number: ");

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
if(n<=0)
{
   if(n==0)
   {
      System.out.println("Zero doesn't have any square root value");
    }
   else
   {
     System.out.println("Due to negative value ");
   }
}

else
{
  double x = Math.sqrt(n);   
  if(x == (int)x) 
    {
     System.out.print("square root of perfefect square:" +x);
     System.out.print(", -" +x);
}
  else
   {
   System.out.println("please enter perfect square number");
}
}
}}
