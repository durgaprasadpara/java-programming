import java.util.*;  
class atm   
{  
public static void main(String[] args)  
{  
    try
    {
Scanner sc= new Scanner(System.in);
System.out.print("Enter the 1st Denomination : ");  
int a= sc.nextInt();  
System.out.print("Enter the 1st Denomination number of notes: ");  
int a1= sc.nextInt();  
System.out.print("Enter the 2nd Denomination: ");  
int b= sc.nextInt();  
System.out.print("Enter the 2nd Denomination number of notes: ");  
int b1= sc.nextInt();
System.out.print("Enter the 3rd Denomination : ");  
int c= sc.nextInt();  
System.out.print("Enter the 3rd Denomination number of notes: ");  
int c1= sc.nextInt();  
System.out.print("Enter the 4th Denomination: ");  
int d= sc.nextInt();  
System.out.print("Enter the 4th Denomination number of notes: ");  
int d1= sc.nextInt();
if(a1<=0 || b1<=0 || c1<=0 || d1<=0)
{
 System.out.println("invalid input");
}
else if(a==500||a==100||a==200||a==2000 && (b==100||b==200||b==500||b==2000)&& (c==100||c==200||c==500||c==2000) && (d==100||d==200||d==500||d==2000 )) 
{
int e=a*a1+b*b1+c*c1+d*d1;  
System.out.println("Total Available Balance in ATM = " +e); 
} 
else{
System.out.println("invalid input");
}
} 
catch(Exception e){
    System.out.println("invalid input");
}
}
}
