import java.util.Scanner;

public class readnum 
{
    public static void main(String[] args)
    {
    try
    {

    int counter = 0;
    double sum = 0;
    int input = 0;
    int positive = 0;
    int negative = 0;
    int positivesum = 0;
    int negativesum = 0;
    double positiveaverage;
    double negativeaverage;

    System.out.print("Enter a series of values (-1 to quit): ");
    Scanner in = new Scanner(System.in);

    while ((input = in.nextInt()) != -1) 
    {

        if (input != -1)
        {
            sum = input + sum;
            counter++;

        if (input>0)
        {
            positive = positive + 1;
            positivesum = positivesum+input;
        }
        else
        {
            negative = negative + 1;
            negativesum = negativesum+input;
        }
        }
     }

    if (counter > 0)
    {

        positiveaverage = positivesum / counter;
        negativeaverage = negativesum / counter;
        System.out.println("Total number of integers entered is " + counter);
        System.out.println("Total positive numbers entered is " + positive);
        System.out.println("Total negative numbers entered is " + negative);
        System.out.println("The positiveaverage value is: " + positiveaverage);
        System.out.println("The negativeaverage value is: " + negativeaverage);
    } 
    else  
     {

            System.out.println("No data was entered.");
     }
     }
    catch(Exception e)
{
   System.out.println("enter only integers");
}
    }
}
