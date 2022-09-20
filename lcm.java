import java.util.*;
public class lcm 
{
    public static void main(String[] args)
   {
     try
         {
        Scanner input = new Scanner(System.in);
        System.out.print("Number 1:- ");
        int num1 = input.nextInt();
        System.out.print("Number 2:- ");
        int num2 = input.nextInt();
        int small = (num1<num2)?num1:num2;
        int count = 1,gcd=0;
        while(count<=small){
            if(num1%count==0 && num2%count==0){
                gcd = count;
            }
            count++;
        }
        int lcm = (num1*num2);
        System.out.println("the GCD is:- "+gcd);
        System.out.println("the LCM is:- "+lcm);

    }
catch (Exception e){
                 System.out.println("invalid input");
                     }
}
}
