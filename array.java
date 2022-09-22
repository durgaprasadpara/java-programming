import java.util.*;
public class array
{
	public static void main(String[] args) {
	    String[] a;
	    Scanner obj=new Scanner(System.in);
	    String s=obj.nextLine();
	    a=s.split(",");
	   String temp;  
	   int total=a.length;
	   System.out.println("N=");
	   try
{
int m=obj.nextInt();
if(m<1)
{
System.out.println("Invalid");
}
else
{
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (Integer.parseInt(a[i]) > Integer.parseInt(a[j]))   
                {  
                    
                    temp = a[i];  
                    a[i] =a[j];  
                    a[j] = temp;  
              }  
            }  
        }  
        System.out.println(m+"th maximum number="+a[total-m]);     
}
}
catch(Exception e)
{
System.out.println("Invalid");
}
}
}
