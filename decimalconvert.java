import java.util.*;
public class decimalconvert
{

    public static void main(String[] args)
    {
        	Scanner scan;
    int num;
          
          scan = new Scanner(System.in);
          System.out.println("Decimal Number: ");
          num = Integer.parseInt(scan.nextLine());
    
          
           String binary = Integer.toBinaryString(num);
           System.out.println("Binary Number = " + binary);
           
           String octal = Integer.toOctalString(num);
           System.out.println("Octal = " + octal);
    }
}
