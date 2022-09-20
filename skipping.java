import java.util.*;
public class skipping
{ 
	public static void main(String[] args) {
         try
           {
		Scanner obj=new Scanner(System.in);
		System.out.println("M=");
		int m=obj.nextInt();
		System.out.println("N=");
		int n=obj.nextInt();
		System.out.println("K=");
		int k=obj.nextInt();
    if(m<=0 || n<=0 || k<=0)
       {
         System.out.println("invalid input");
        }
    else if(k>=n || n<=m)
         {
        System.out.println("invalid input");
          }
		while(m<=n)
		{
		    System.out.println(m);
		    m=m+k+1;
		}
  }
           catch (Exception e){
           System.out.println("invalid input");
	}
}
}
