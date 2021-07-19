package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {

		int menuSelection;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("\nPlease select an option: "
					+ "\n1. Cups to Teaspoons"
					+ "\n2. Miles to Kilometers"
					+ "\n3. Pounds to Kilograms"
					+ "\n4. Quit");
			
			menuSelection = scan.nextInt();
			
				switch(menuSelection) {
				case 1:
					System.out.println("\n1 cup is 48 teaspoons");
					break;
				case 2:
					System.out.println("\n1 mile is 1.6 kilometers");
					break;
				case 3:
					System.out.println("\n1 pound is 0.454 kilogram");
				}
			}
		 
		
		while(menuSelection != 4);
	}
	
	

}
