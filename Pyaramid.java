import java.util.Scanner;
 
public class Pyaramid
{            
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.printf("enter the no of rows:");
     int n = input.nextInt();    
        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
  
    }
  
}
