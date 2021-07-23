package game;

import java.util.Scanner;

import Fixture.Room;

public class Main {

	public static void main(String[] args) {

		RoomManager rm = new RoomManager();
		rm.init();
		
		Player player = new Player();
		player.currentRoom = rm.startingRoom;
		player.currentRoom.setItem(rm.startingRoom.getItem());
		printRoom(player);
		System.out.println(player.currentRoom.shortDescription);
		System.out.println(player.currentRoom.longDescription);
		
		if(player.currentRoom.getItem().name == null) {
			System.out.println("\nThere are no items");
		} else {
			System.out.println("\nItem: ");
			System.out.println(player.currentRoom.getItem().name);
		}
		
		System.out.println("\nExits: ");
		for (int i = 0; i < player.currentRoom.getExits().length; i++) {
			if(player.currentRoom.getExits()[i] != null) {
				System.out.println(player.currentRoom.getExits()[i].name);
			}
		}
		System.out.println();
		
		Scanner inputScan = new Scanner(System.in);
		String input = "";
		
		while(!input.equals("no")) {
			parse(collectInput(), player);
			System.out.println("Do you want to continue?");
			input = inputScan.nextLine().toLowerCase();
		}

		
	}
	
	private static void printRoom(Player player) {
		System.out.println("The player's current room is " + player.currentRoom.name);
	}
	
	private static String[] collectInput() {
		String[] inputArray = new String[2];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please choose an action");
		System.out.println("Input two words");
		String input = scan.nextLine().toLowerCase();
		inputArray = input.split(" ");
		
		return inputArray;
	}
	
	private static void parse(String[] command, Player player) {
		
		Room currentRoom = player.currentRoom;
				
		String action = command[0];
		String choice = command[1];
		
		switch(action) {
		case "go":
			
			player.currentRoom = currentRoom.getExit(choice);
			player.currentRoom.setItem(currentRoom.getExit(choice).getItem());
			printRoom(player);
			System.out.println(player.currentRoom.shortDescription);
			System.out.println(player.currentRoom.longDescription);
			
			if(player.currentRoom.getItem().name == null) {
				System.out.println("\nThere are no items");
			} else {
				System.out.println("\nItem: ");
				System.out.println(player.currentRoom.getItem().name);
			}
			
			System.out.println("\nExits: ");
			for (int i = 0; i < player.currentRoom.getExits().length; i++) {
				if(player.currentRoom.getExits()[i] != null) {
					System.out.println(player.currentRoom.getExits()[i].name);
				}
			}
			System.out.println();
			break;
			
		case "interact":
			System.out.println(player.currentRoom.getItem().longDescription);
			break;
			
//		case "take":
//			if(currentRoom.getItem().name != null) {
//				player.item = currentRoom.getItem();
//				currentRoom.setItem(null);
//				System.out.println("Player has taken " + player.item.name);
//			} else {
//				System.out.println("There is no item in this room");
//			}
//			
//			break;
//			
//		case "put":
//			if(player.item.name != null) {
//				currentRoom.setItem(player.item);
//				player.item = null;
//				System.out.println("Player has put down " + currentRoom.getItem().name + " in " + currentRoom.name);
//			} else {
//				System.out.println("The player is not carrying any items");
//			}
//			break;
			
		case "exit":
			System.exit(0);
		}
		
	}

}
