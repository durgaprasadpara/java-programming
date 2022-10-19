import java.util.Arrays; 
import java.util.Scanner; 
    public class sort
    {  
    public static void main(String args[])   
    {  
  Scanner input = new Scanner(System.in);
  Scanner a = new Scanner(System.in);
try
{
    System.out.println("enter the no of countries");
    int n=input.nextInt();
    String[] countries= new String[n+1] ;
 System.out.println("enter the countries");
 for(int i = 0; i<n; i++) 
{
  countries[i]=a.nextLine(); 
}
    int size = n ;
    for(int i = 0; i<size-1; i++)   
    {  
    for (int j = i+1; j<size-1; j++)   
    {  
      
    if(countries[i].compareTo(countries[j])>0)   
    {  
     
    String temp = countries[i];  
    countries[i] = countries[j];  
    countries[j] = temp;  
    }  
    }  
    }  
    
    System.out.println(Arrays.toString(countries));
}
    catch(Exception e)
    {
         System.out.println("Enter the valid mark");
        }  
    }  
    }
