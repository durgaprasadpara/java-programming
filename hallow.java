import java.util.Scanner;
class hallow
{
public static void main(String[] args) 
{
try
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no.of.rows:");
int row = sc.nextInt();
System.out.println("Enter the no.of.coloumns:");
int col = sc.nextInt();
if(row<=0||col<=0)
{
  System.out.println("Enter only positive numbers");
}
if(row<=0&&col<=0)
{
  System.out.println("Enter only positive numbers");
}
else
{
for (int i = 1; i <=row; i++) 
{
 for (int j = 1; j <=col; j++) 
 {
     if((i==1 || i==row) || (j==1 || j==col))
     {
       System.out.print("$");

     }
     else
     {
         System.out.print(" ");
     }
  }
System.out.println();
}
}
}
catch(Exception e)
{
  System.out.println("Invalid due to character exception");
}
}
}
