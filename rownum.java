import java.util.*;
class rownum
{

	public static void main(String s[])
	{
           try
           {
		int i, j, c, N;

		Scanner sc=new Scanner(System.in);
                System.out.println("Enter the rows:");
                N=sc.nextInt();
                if(N<=0)
                {
                  System.out.println("Enter only positive numbers");
                }
                else
                {
		c = 1;
		for (i = 1; i <= N; i++)
		{
			for (j = 1; j <= i; j++)
			{
				System.out.print(c*c + "  ");
				c++;
			}
			System.out.println("");
		}
               }
           }
           catch(Exception e)
           {
               System.out.println("Due to character exception");
           }
	}
}
