import java.util.*;
public class duplicate {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
   try
      {
        System.out.print("enter the size of the array:- ");
        int size = input.nextInt();
        int[] arr = new int[size];
        SortArr.Dummyarr(arr,input);
}
catch(Exception e)
     {
   System.out.println("Invalid");
     }
    }
}

class SortArr {
    public static void Dummyarr(int[] arr, Scanner input) {
        int i, j;
        System.out.println("enter the elements in the array:- ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
   
        for (i = 0; i < arr.length - 1; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        List<Integer> list = new ArrayList<>();

        for(i=0;i<arr.length-1;i++){
           if(arr[i]!=arr[i+1])
               list.add(arr[i]);
        }
        list.add(arr[arr.length-1]);
        System.out.println(list);
    }
}

