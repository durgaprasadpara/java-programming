import java.util.Scanner;
class rightpat
{
 public static void main(String[] args)
 {
 int i, j;
 char ch;
 Scanner s= new Scanner(System.in);
 System.out.print(" Enter any Character : ");
ch = s.next().charAt(0);
 System.out.println("Enter the no.of rows");
 int row = s.nextInt();
 
 for(i=0; i<row; i++)
 {
 for(j=i; j>=0; j--)
 System.out.print(ch+" ");
 System.out.print("\n");
 }
 for(i=0; i<(row-1); i++)
 {
 for(j=(row-1); j>i; j--)
 System.out.print(ch+" ");
 System.out.print("\n");
 }
 }
}
