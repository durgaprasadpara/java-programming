import java.util.Arrays; 
import java.util.*;
public class commonelements 
{
public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       String [] array1;
       String [] array2;
       int a,b;
       int n1,n2,i,j;
       System.out.print("Enter the no. of elements for array 1: ");
       n1=sc.nextInt();
       array1 = new String[n1];
       System.out.print("Enter the elements:");
       for(a=0;a<n1;a++)
       {
          array1[a]=sc.next();
       }
       System.out.print("Enter the no. of elements for array 2: ");
       n2=sc.nextInt();
       array2 = new String[n2];
       System.out.print("Enter the elements:");
       for(b=0;b<n2;b++)
       {
          array2[b]=sc.next();
       }
       System.out.println("Array1 : "+Arrays.toString(array1));
       System.out.println("Array2 : "+Arrays.toString(array2));
       for (i = 0; i < n1; i++)
        {
            for (j = 0; j < n2; j++)
            {
                if(array1[i].equals(array2[j]))
                {
                 
                 System.out.println("Common element is : "+(array1[i]));
                 }
                
            }
        }
 
    }
}
