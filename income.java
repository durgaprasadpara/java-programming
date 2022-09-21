import java.io.*;
import java.util.*;
class income
{
	public static void main(String[] args)
	{
		try 
		{
		    int i;
		    float j;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the income");
		    i=sc.nextInt();
		    if(i<=0)
		    {
		        System.out.println("Enter the valid income");
		    }
		    if(i<=150000)
		    {
		        j=0;
		        System.out.println("Tax:"+j);
		    }
		    if(i>150000&&i<=300000)
		    {
		        j=i*10/100;
		        System.out.println("Tax:"+j);
		    }
		    if(i>300000&&i<=500000)
		    {
		        j=i*20/100;
		        System.out.println("Tax:"+j);
		    }
		    if(i>500000)
		    {
		        j=i*30/100;
		        System.out.println("Tax:"+j);
		    }
		    
		}
		catch(Exception e)
		{
		        System.out.println("Enter the valid income");
		}
	}
}
