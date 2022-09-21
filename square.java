import java.util.*;
public class square  {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
     try
       {
        int m,n,i;
        int[] a=new int[200];
        System.out.print("enter the starting number:- ");
        m = input.nextInt();
        System.out.print("enter the endin number:- ");
        n = input.nextInt();
      if(m<=0 || n<=0)
       {
         System.out.println("invalid input");
        }
     else if(m==n || m>=n)
         {
        System.out.println("invalid input");
          }
      else
        {
          for (i=m;i<=n;i++)
             {
               a[i]= i*i;
              }
          }
         for (i=m;i<=n;i++)
           {
             System.out.println(+a[i]);
          }
      }
  catch(Exception e)
     {
   System.out.println("Invalid due to floating point");
     }
}
}
