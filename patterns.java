import java.util.*;
class patterns
{
 public static void main(String[] args) 
{
 try
 {
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter a number: ");
 int c= sc.nextInt();
 for (int i = 0; i <= c; ++i)
 {
  for(int j=1;j<=i;j++)
  {
      System.out.print(i+"\t");
      
      
  }
  
  System.out.println();
  
 }
 }
 catch(Exception e)
 {
   System.out.println("Due to character exception");
 }
}
}
