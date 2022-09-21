import java.util.*;
public class charead
{
    public static void main(String[] args) {
        try
        {
        Scanner input = new Scanner(System.in);
        char ch = '0';
        int up_c =0;
        int lo_c = 0,num_c=0;
        while (ch != '*') {
            System.out.print("enter the character:- ");
            ch = input.next().charAt(0);
            if(Character.isUpperCase(ch)){
                up_c++;
            }
            else if(Character.isLowerCase(ch)){
                lo_c++;
            }
            else if(Character.isDigit(ch)){
                num_c++;
            }

        }
        System.out.println("the no.of.uppercase is "+up_c);
        System.out.println("the no.of.lowercase is "+(lo_c));
        System.out.println("the no.of.numbers is "+num_c);
    }
    catch(Exception e){
        System.out.println("invalid input");
    }
    }
}
