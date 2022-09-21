import java.util.Scanner;
 class leap {
   public static void main(String[] args){
	try{
	int date;
      System.out.println("Enter date :: ");
      Scanner sc = new Scanner(System.in);
      date = sc.nextInt();
	int month;
      System.out.println("Enter month :: ");
      Scanner sc1 = new Scanner(System.in);
      month = sc.nextInt();
      int year;
      System.out.println("Enter an Year :: ");
      year = sc.nextInt();
      Scanner sc2 = new Scanner(System.in);
      System.out.println("The entered date is:"+date+"/"+month+"/"+year);
     
	if((date<=31)&& (date>0) && (month<=12)){

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Specified year is a leap year");
      else
         System.out.println("Specified year is not a leap year");
}
else{
	System.out.println("enter valid data");
}
}
catch(Exception e){
	System.out.println("enter valid data");
   }
}
}
