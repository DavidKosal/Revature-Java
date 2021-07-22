package game;

import java.util.Scanner;

import Fixture.Room;

public class Main {

	public static void main(String[] args) {

		collectInput();
	}
	
	private static void printRoom(Player player) {
		System.out.println(player.currentRoom);
	}
	
	private static String[] collectInput() {
		String[] inputArray = new String[2];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please choose an action");
		System.out.println("Input two words");
		String input = scan.nextLine();
		inputArray = input.split(" ");
		System.out.println(inputArray[0]);
		System.out.println(inputArray[1]);
		
		return inputArray;
	}
	
	private static void parse(String[] command, Player player) {
		
	}

}
