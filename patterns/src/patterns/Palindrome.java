package patterns;

import java.util.Scanner;

public class Palindrome {
	
	public static String  plaindrome(int n) {
		int rev = 0;
		int result = n;
		while(n>0) {
			int rem = n%10;
			rev = rem + rev*10;
			n = n/10;
		}
		
		if(rev ==result ) {
			return "Number is plaindrome";
		}
		else 
			return "Number is not plaindrome";
	}
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				sc.close();
				System.out.println(plaindrome(n));
	}
}
