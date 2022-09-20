import java.util.Scanner; 
 public class reverse
 { 
             public static void main(String[] args) 
       { 
            try 
                     { 
                 System.out.println("Enter a number to Reverse"); 
                 Scanner in = new Scanner(System.in); 
                 int num = in.nextInt(); 
                 int NumberReverse = 0; 
                 int remainder = 0; 
                     while(num > 0) 
                  { 
                      remainder = num %10; 
                      NumberReverse = NumberReverse * 10 + remainder; 
                      num = num /10; 
                  } 
 System.out.println("The Reversed Number is: " + NumberReverse); 
            } 
 catch (Exception e){
                 System.out.println("invalid input");
                      }
       } 
}
