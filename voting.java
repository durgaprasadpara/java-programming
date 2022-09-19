import java.util.Scanner;
 
public class voting {
 
 public static void main(String[] args) 
 {
 try
   {
   int age,shrt;
 Scanner scan = new Scanner(System.in);
 System.out.println(" Please enter your age");
 age = scan.nextInt();
 if(age<=0)
 throw new ArithmeticException("invali 0 or negative value");
 if(age>=18)
 {
 System.out.println("Welcome to voting system Yo can Vote");
 }
 else
 {
 shrt= (18 - age);
 System.out.println("Sorry,You can vote after :"+ shrt + " years");
 }
 
 }
 catch(ArithmeticException e)
{
System.out.println(e.getMessage());
}
catch(Exception e)
{
System.out.println("invalid due to floating point");
}
} 
}
