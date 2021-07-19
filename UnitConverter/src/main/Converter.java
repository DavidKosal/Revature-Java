package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {

		int menuSelection;
		double quantity;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("\nPlease select an option: " + "\n1. Cups to Teaspoons" + "\n2. Miles to Kilometers"
					+ "\n3. Pounds to Kilograms" + "\n4. Quit");

			menuSelection = scan.nextInt();

			switch (menuSelection) {
			case 1:
				quantity = collectQuantity("cup","teaspoon");
				System.out.println(quantity + " teaspoon");
				break;
			case 2:
				quantity = collectQuantity("mile","kilometer");
				System.out.println(quantity + " kilometer");
				break;
			case 3:
				quantity = collectQuantity("pound","kilogram");
				System.out.println(quantity + " kilogram");
				break;
			}
		}

		while (menuSelection != 4);
	}

	private static double collectQuantity(String unit1, String unit2) {
		Scanner scan = new Scanner(System.in);
		double quantity = 0;
		
		switch(unit1) {
		case "cup":
			System.out.println("\nHow many " + unit1 + " do you have?");
			quantity = scan.nextDouble();
			quantity = quantity * 48.0;
			break;
		case "mile":
			System.out.println("\nHow many " + unit1 + " do you have?");
			quantity = scan.nextDouble();
			quantity = quantity * 1.6;
			break;
		case "pound":
			System.out.println("\nHow many " + unit1 + " do you have?");
			quantity = scan.nextDouble();
			quantity = quantity * 0.454;
			break;
		}
		
		return quantity;
		
	}
	
	public double convertCupToTeaspoon(double qty) {

		return qty * 48;
	}

	public double convertMilesToKilometer(double qty) {
		return qty * 1.6;
	}

	public double convertPoundToKilogram(double qty) {
		return qty * 0.454;
	}

}
