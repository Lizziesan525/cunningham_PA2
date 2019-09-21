package cunningham_p2;

import java.util.Scanner;

public class project2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double weightInPounds;
		double heightInInches;
		double bmi;
		
		System.out.println("Please enter a weight in pounds: ");
		weightInPounds = in.nextDouble();
		
		System.out.println("Please enter a height in inches: ");
		heightInInches = in.nextDouble();
		
		bmi = (703 * weightInPounds) / (heightInInches * heightInInches);
		
		System.out.printf("Your BMI is %.2f.\n", bmi);
	}

}
