package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {

		int menuSelection;
		double quantity;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("\nPlease select an option: " + "\n1. Volumne Conversion" + "\n2. Distance Conversion"
					+ "\n3. Weight Conversion" + "\n4. Quit");

			menuSelection = scan.nextInt();

			switch (menuSelection) {
			case 1:
				System.out.println("\n Please choose a conversion: ");
				System.out.println("1. Teaspoon to Tablespoon");
				System.out.println("2. Cup to Teaspoon");

				menuSelection = scan.nextInt();

				switch (menuSelection) {
				case 1:
					quantity = collectQuantity("teaspoon", "tablespoon");
					System.out.println(quantity + " tablespoon");
					break;
				case 2:
					quantity = collectQuantity("cup", "teaspoon");
					System.out.println(quantity + " teaspoon");
					break;
				}
				break;

			case 2:
				System.out.println("\n Please choose a conversion: ");
				System.out.println("1. Mile to Kilometer");
				System.out.println("2. Feet to Meter");

				menuSelection = scan.nextInt();

				switch (menuSelection) {
				case 1:
					quantity = collectQuantity("mile", "kilometer");
					System.out.println(quantity + " kilometer");
					break;
				case 2:
					quantity = collectQuantity("feet", "meter");
					System.out.println(quantity + " meter");
					break;
				}
				break;

			case 3:
				System.out.println("\n Please choose a conversion: ");
				System.out.println("1. Pound to Kilogram");
				System.out.println("2. Ounces to gram");

				menuSelection = scan.nextInt();

				switch (menuSelection) {
				case 1:
					quantity = collectQuantity("pound", "kilogram");
					System.out.println(quantity + " kilogram");
					break;
				case 2:
					quantity = collectQuantity("ounce", "gram");
					System.out.println(quantity + " gram");
					break;
				}
				break;

			}
		}

		while (menuSelection != 4);
	}

	private static double collectQuantity(String unit1, String unit2) {
		Scanner scan = new Scanner(System.in);
		double quantity = 0;

		switch (unit1) {
		case "teaspoon":
			System.out.println("\nHow many " + unit1 + " do you have?");
			quantity = scan.nextDouble();
			quantity = quantity / 3.0;
			break;
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
		case "feet":
			System.out.println("\nHow many " + unit1 + " do you have?");
			quantity = scan.nextDouble();
			quantity = quantity / 3.281;
			break;
		case "pound":
			System.out.println("\nHow many " + unit1 + " do you have?");
			quantity = scan.nextDouble();
			quantity = quantity * 0.454;
			break;
		case "ounce":
			System.out.println("\nHow many " + unit1 + " do you have?");
			quantity = scan.nextDouble();
			quantity = quantity * 28.35;
			break;
		}

		return quantity;

	}

	public double convertTeaspoonToTablespoon(double qty) {
		return qty / 3;
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
