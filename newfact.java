import java.util.*;
import java.util.Scanner;
class newfact{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){ 
try
{ 
  Scanner sc = new Scanner(System.in);
  int i,fact=1;  
  int number;
  System.out.println("enter the number:");
  number=  sc.nextInt();
if(number<0){
     System.out.println("Invalid");
     }
else{
  fact = factorial(number);   
  System.out.println("Factorial of "+number+" is: "+fact); 
}
}
catch(Exception e)
{
   System.out.println("Invalid due to floating point");
}   
 }  
}
