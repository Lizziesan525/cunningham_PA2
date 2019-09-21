package cunningham_p1;

import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello");
		int userCode = 0;
		int digit1 = 0;
		int digit2 = 0;
		int digit3 = 0;
		int digit4 = 0;
		
		System.out.println("Enter a 4 digit number:    ");
		userCode = in.nextInt();
		
		digit1 = userCode / 1000;
		digit2 = (userCode / 100) % 10;
		digit3 = (userCode % 100) / 10;
		digit4 = userCode % 10;
		
		
		digit1 = (digit1 + 7) % 10;
		digit2 = (digit1 + 7) % 10;
		digit3 = (digit1 + 7) % 10;
		digit4 = (digit1 + 7) % 10;
			
		System.out.println(digit3 + "" + digit4 + "" + digit1 + "" + digit2);
		
	}

}
