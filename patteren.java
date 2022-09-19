import java.util.Scanner;
public class patteren
{    
public static void main(String args[])   
{      
int i, j, row;
Scanner s = new Scanner(System.in); 
System.out.print("Enter the number of rows:");
row=s.nextInt();     
for (i=0; i<row; i++)   
{       
for (j=2*(row-i); j>=0; j--)         
{        
System.out.print(" ");   
}   
for (j=0; j<=i; j++ )   
{   
System.out.print("* ");   
}   
System.out.println();   
}   
}   
}
