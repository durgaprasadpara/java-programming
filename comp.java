import java.util.Scanner;
class comp 
{
 public static void main(String[] args)
 {
try
{
 int p_count = 0, c_count = 0;
 int[] arr;
 int size;
 Scanner s = new Scanner(System.in);
 System.out.print("Enter the no. of element: ");
 size = s.nextInt();
 arr = new int[size];
 System.out.println("Enter the elements: ");
 for (int i = 0; i < size; i++)
 arr[i] = s.nextInt();
 for (int j = 0; j < size; j++)
 {
 int count = 0;
 if (arr[j] > 0)
 {
 for (int k = 1; k <= arr[j]; k++) 
{
 if (arr[j] % k == 0)
 count++;
 }
 if (count > 2)
 c_count++;
 else
 p_count++;
 }
 else if(arr[j]<0)
 {
 for (int k =arr[j]; k<=-1; k++)
 {
 if (arr[j] % k == 0)
 count++;
 }
 if (count > 2)
{
 c_count++;
 }
 else
{
 p_count++;
 }
 }
 }
 System.out.println("No. of composite num: " + c_count);
 s.close();
 }
catch(Exception e)
{
System.out.println("Due to float or number exception");
}
}
 }
