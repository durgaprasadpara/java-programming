import java.util.*;
public class primecount{
public static void main(String[] args){
try
  {
int
i,j,m=0,flag=0,prime=0,composite=0,n,count;
Scanner s= new Scanner(System.in);
System.out.println("Enter the no.of values");
count=s.nextInt();
System.out.println("Enter the numbers:");
for(j=0;j<count;j++){
n=s.nextInt();
while(count<=0 || n<=0)
{
System.out.println("invalid");
   break;
}
m=n/2;
if(n==0||n==1){
prime=prime+1;
}
else
{
for(i=2;i<=m;i++){
if(n%i==0){
composite=composite+1;
flag=1;
break;
}
}
if(flag==0){
prime=prime+1;
}
}
}
System.out.println("no.of prime"+prime);
System.out.println("no.of composite"+composite);
}
catch (Exception e){
           System.out.println("invalid input");
	}
}}
