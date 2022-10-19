import java.util.Scanner;
 
public class rt
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
         
        int rows = sc.nextInt();
         
 
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++) 
            { 
                System.out.print(i+" "); 
            } 
             
            System.out.println(); 
        }        
        for (int i = rows-1; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
             
            System.out.println();
        }        
        sc.close();
    }
}
