import java.util.*;  
class staffusers  
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in);    
System.out.print("Enter the total number of users : ");  
int a= sc.nextInt();  
System.out.print("Enter the staff users: ");  
int b= sc.nextInt();  
int c=a-b;
int total=c-b/3;
System.out.println("Total= " +total);  
}  
}
