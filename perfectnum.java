import java.util.*;  
class perfectnum{

static boolean isPerfect(int n)
{
    int sum = 1;
    for (int i = 2; i * i <= n; i++)
    {
        if (n % i==0)
        {
            if(i * i != n)
                sum = sum + i + n / i;
            else
                sum = sum + i;
        }
    }
    if (sum == n && n != 1)
        return true;
 
    return false;
}

public static void main (String[] args)
{
    System.out.println("Enter no of perfect numbers:");
    Scanner sc= new Scanner(System.in); 
    int p= sc.nextInt(); 
    System.out.println("Perfect numbers:");
    for (int n = 2; n < p; n++)
        if (isPerfect(n))
            System.out.println( n );
}
}
