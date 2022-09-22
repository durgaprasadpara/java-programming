import java.util.*;  
class persquare
{
static void perfectSquares(int l, int r)
{
 if(l<0 || r<0)
       {
         System.out.println("invalid input");
        }
 else if(l==r || l>r)
        {
          System.out.println("invalid input");
           }
      else{

	for (int i = l; i <= r; i++)
	{
		if (Math.sqrt(i) == (int)Math.sqrt(i))
			System.out.print(i + " ");
	}
}
}
public static void main (String[] args)
{
  try
      {
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower number: ");
        int l=sc.nextInt();
        System.out.println("Enter upper number: ");
        int r=sc.nextInt();
	perfectSquares(l, r);

       }
        catch(Exception e)
     {
   System.out.println("Invalid due to floating point");
     }
}
}
