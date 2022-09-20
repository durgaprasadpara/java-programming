import java.util.*;
class maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the size of the array:- ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the values in the array:- ");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("enter the Mth max number:- ");
        int m = input.nextInt();
        System.out.print("enter the Nth min number:- ");
        int n = input.nextInt();
        int max=0,min=0;
        if(m==0)
            System.out.println("please enter the valid input");
        else{
            max = arr[arr.length-m];
            min = arr[n-1];
            System.out.println("the max is "+max);
            System.out.println("the min is "+min);
            System.out.println("the sum is: "+(max+min));
            System.out.println("the min is: "+(max-min));
        }
    }
}
