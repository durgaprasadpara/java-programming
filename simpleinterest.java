import java.util.Scanner;
public class simpleinterest
{
    public static void main(String args[]) 
    {
     try
        {
        Scanner sc = new Scanner(System.in);
        float p, t, si=0;
        int l;
        System.out.println("Enter the Principal : ");
        p = sc.nextFloat(); 
        System.out.println("Enter the Time period : ");
        t = sc.nextFloat(); 
        System.out.println("choose below options:");
        System.out.println("1.senior citizen    2.not senior citizen");
        l = sc.nextInt();
      if(p<=0 || t<=0 || l<=0)
       {
         System.out.println("invalid input");
        }
       else if(l == 1)     
        {
         si = si+(p * 12 * t) / 100;
         }
       else
           {
           si = si+(p * 10 * t) / 100;
           }
       System.out.println("Simple Interest is: " + si);
      }
   catch(Exception e)
    {
   System.out.println("Invalid due to floating point");
      }
    
} }
