import java.util.*;
public class multable  {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
     try
       {
        int m,n,i;
        System.out.print("enter the starting number:- ");
        m = input.nextInt();
        System.out.print("enter the endin number:- ");
        n = input.nextInt();
      if(m<=0 || n<=0)
       {
         System.out.println("invalid input");
        }
     else if(m==n)
         {
        System.out.println("invalid input");
          }
        else{
        for(i=1;i<=n;i++){
            System.out.println(m+"*"+i+"="+(i*m));
        }}}
catch(Exception e)
{
   System.out.println("Invalid due to floating point");
}
}
}
