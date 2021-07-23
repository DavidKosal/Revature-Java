package game;

import Fixture.Item;
import Fixture.Room;

public class RoomManager {
	
	Room startingRoom;
	Room[] rooms = new Room[10];
	
	public void init() {
		Room foyer = new Room("Foyer", "a small Foyer", 
				"This is the entrance to the house. It is a modest size meant with shoe racks next to the wall.");
		this.rooms[0] = foyer;
		this.startingRoom = foyer;
		
		
		Room LivingRoom = new Room("Living Room", "the living room", 
				"A big living room with a takes the most space of the house.");
		this.rooms[1] = LivingRoom;
		foyer.setExit(LivingRoom, "north");
		LivingRoom.setExit(foyer, "south");
		LivingRoom.getItem().setItem("couch", "a small couch", "You sit on the couch. It feels comfortable");
		
		Room Bathroom = new Room("Bathroom", "bathroom with toilet, shower and sink", 
				"This bathroom has white tiles with bath mats near the sink, toilet and shower. The toilet has a seat warmer.");
		this.rooms[2] = Bathroom;
		LivingRoom.setExit(Bathroom, "west");
		Bathroom.setExit(LivingRoom, "east");
		Bathroom.getItem().setItem("toilet", "toilet with a seat warmer", "You sit on the toilet. You feel warm");
		
		Room Kitchen = new Room("Kitchen", "an open kitchen with an island", 
				"The kitchen has a fridge, dishwasher, microwave and oven. The countertops and island are made out of quartz.");
		this.rooms[3] = Kitchen;
		LivingRoom.setExit(Kitchen, "east");
		Kitchen.setExit(LivingRoom, "west");
		Kitchen.getItem().setItem("apple", "apple sitting on a counter", "You eat the apple. It tastes delicious");
		
		Room Bedroom = new Room("Master Bedroom", "a master bedroom",
				"The master bedroom has a king sized bed with a walk in closet and an attached bathroom");
		this.rooms[4] = Bedroom;
		LivingRoom.setExit(Bedroom, "north");
		Bedroom.setExit(LivingRoom, "south");
		Bedroom.getItem().setItem("bed", "king sized bed", "You lay down on the bed. You feel sleepy");
		
		Room Bathroom2 = new Room("Master Bathroom", "bathroom attached to bedroom", 
				"Bathroom attached to the master bedroom. Has a hot tub in the middle of the room");
		this.rooms[5] = Bathroom2;
		Bedroom.setExit(Bathroom2, "west");
		Bathroom2.setExit(Bedroom, "east");
		Bathroom2.getItem().setItem("hot tub", "relaxing hot tub", "You get in the hot tub. You feel relaxed");
		
		Room Closet = new Room("Walk in Closet", "closet attached to master bedroom", 
				"A closet that has plenty of space for clothes and other storage");
		this.rooms[6] = Closet;
		Bedroom.setExit(Closet, "north");
		Closet.setExit(Bedroom, "south");
		
		Room DiningRoom = new Room("Dining Room", "a dining room", 
				"A dining that has a table with many chairs meant to host a lot of guests");
		this.rooms[7] = DiningRoom;
		Kitchen.setExit(DiningRoom, "north");
		DiningRoom.setExit(Kitchen, "south");
	}

}
