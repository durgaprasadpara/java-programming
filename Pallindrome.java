import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the string:- ");
        String value = input.next();
        try{
            int num = Integer.parseInt(value);
            int rev = 0,rem,num2=num;
            while(num!=0){
                rem = num%10;
                rev = rev*10+rem;
                num = num/10;
            }
           if(num2==rev)
               System.out.println("the number is pallindrome");
           else
               System.out.println("the number is not a polindrome");
        }
        catch(Exception e){
            StringBuffer s1 = new StringBuffer(value);
            s1.reverse();
            String s2 = s1.toString();
            if (value.equals(s2))
                System.out.println("the strings are pallindrome");
            else
                System.out.println("the strings are not pallindrome");
        }

    }
}
