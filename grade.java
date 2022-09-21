import java.util.*;
class grade {
    public static void main(String[] args) {
        try {
            float m1, m2, m3, m4;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter marks in python:");
            m1 = sc.nextFloat();
            System.out.println("enter marks in c programming:");
            m2 = sc.nextFloat();
            System.out.println("enter marks in mathematics:");
            m3 = sc.nextFloat();
            System.out.println("enter marks in physics:");
            m4 = sc.nextFloat();
            if (m1 > 100  || m2 > 100 || m3 > 100 || m4 > 100)
            {
                throw new NullPointerException("invalid due to higher values.");
            }
            if (m1 <0  || m2 <0 || m3 <0 || m4 <0)
            {
                throw new ArithmeticException("invalid due to higher values.");
            }


            float total=m1+m2+m3+m4;
            float agg=total/4;
            System.out.println("TOTAL= " + total);
            System.out.println("Aggregate=" + agg);

            if(agg>75)
            {
                System.out.println("DISTINCTION");
            }
            else if(agg>=60 && agg<75)
            {
                System.out.println("FIRST DIVISION");
            }
            else if(agg>=50 && agg<60)
            {
                System.out.println("SECOND DIVISION");
            }
            else if(agg>=40 && agg<50)
            {
                System.out.println("THIRD DIVISION");
            }
            else
            {
                System.out.println("FAIL");
            }
        }
        catch(Exception e)
        {
            System.out.println("Enter the valid mark");
        }
    }
}
