import java.util.Scanner;

public class spechar {
	private static Scanner sc;
	public static void main(String[] args) {
		String aldisp_str;
		int i, alph, digi, spl;
		alph = digi = spl = 0;
		char ch;
		
		sc= new Scanner(System.in);
		System.out.print("\nPlease Enter Alpha Numeric Special String =  ");
		aldisp_str = sc.nextLine();
		
		for(i = 0; i < aldisp_str.length(); i++)
		{
			ch = aldisp_str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
			    System.out.println(ch);
				spl++;
			}
		}		
		System.out.println("Number of Special Characters   =  " + spl);
	}
}

