import java.io.*;
import java.lang.*;
import java.util.Scanner;
class mode
{
public static void main(String[] args)
{
try
{
 Scanner a= new Scanner(System.in);
 System.out.println("enter the number of array elements");
 int n = a.nextInt();
int[] invalue = new int[n+1];
double tot=0;
double mean=0;
System.out.println("enter elements");
for(int i=0;i<n;i++){
invalue[i]=a.nextInt();
tot = tot+invalue[i];
}
mean = tot/n;
System.out.println("The mean value is: "+mean);
int median = 0;
int mid=0;
if(n%2 == 0)
{
mid=invalue[(n/2+(n/2+1))/2];
System.out.println("Median value is: "+mid);
}
else
{
int temp=(n/2);
for(int i=0;i<n;i++)
{
if(temp==i)
{
mid=invalue[i];
System.out.println("Median value: "+mid);
}
}
}
int i,j,z, tmp, maxCount, modeValue;
int[] tally=new int[n];
for(i=0;i<n;i++)
{
for(j=0;j<n-i;j++)
{
if(j+1!=n)
{
if(invalue[j]>invalue[j+1])
{
tmp=invalue[j];
invalue[j]=invalue[j+1];
invalue[j+1]=tmp;
}
}
}
}
for (i = 0; i < n; i++)
{
for(z=i+1;z<n;z++)
{
if(invalue[i]==invalue[z])
{
tally[i]++;
}
}
}
maxCount = 0;
modeValue = 0;
for (i = 0; i <n; i++)
{
if (tally[i] > maxCount)
{
maxCount = tally[i];
modeValue = invalue[i];
}
}
System.out.println("Mode value is :"+modeValue);
}
catch(Exception e)
{
   System.out.println("Invalid due to floating point");
}
}
}
