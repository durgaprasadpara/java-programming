import java.util.Scanner;
class pascal
{
 public static void main(String[] args)
 {
 int num;
 Scanner s = new Scanner(System.in);

 System.out.print("Enter the Row Size of Pascal Triangle: ");
 int row = s.nextInt();

 for(int i=0; i<row; i++)
 {
 for(int space=row; space>i; space--)
 System.out.print(" ");
 num=1;
 for(int j=0; j<=i; j++)
 {
 System.out.print(num+ " ");
 num = num*(i-j)/(j+1);
 }
 System.out.print("\n");
 }
 }
}
