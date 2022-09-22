import java.util.*;
class consonants {

  public static void main(String[] args) {
 try
    {
    Scanner sc= new Scanner(System.in); 
    System.out.print("Enter a string: ");  
    String line= sc.nextLine();  
    int vowels = 0,
    consonants = 0, 
    digits = 0, 
    spaces = 0;

    line = line.toLowerCase();
    for (int i = 0; i < line.length(); ++i) {
      char ch = line.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        ++vowels;
        System.out.print("Vowel:"+ch+"\n");
      }
      else if ((ch >= 'a' && ch <= 'z')) {
        ++consonants;
        System.out.print("constant:"+ch+ "\n");
      }
      else if (ch >= '0' && ch <= '9') {
        ++digits;
        System.out.print("Number:"+ch+"\n");
      }
      else if (ch == ' ') {
        ++spaces;
      }
    }
}
  catch(Exception e)
     {
   System.out.println("Invalid due to floating point");
     }

  }
}
