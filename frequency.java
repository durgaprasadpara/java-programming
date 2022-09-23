import java.util.Scanner; 
public class frequency {  
    public static void main(String[] args) { 
 Scanner s = new Scanner(System.in);
 System.out.print("Enter the no. of element: ");
 int size = s.nextInt();
 int [] arr = new int[size];
 System.out.println("Enter the elements: ");
 for (int i = 0; i < size; i++)
 arr[i] = s.nextInt();
        int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  
    }}
