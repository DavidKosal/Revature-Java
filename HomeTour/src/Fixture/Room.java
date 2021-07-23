package Fixture;

public class Room extends Fixture{
	private Room[] exits;
	private Item item;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];
		this.item = new Item();
	}
	
	public Room[] getExits() {
		return exits;
	}
	
	public Room getExit(String direction) {
		switch(direction) {
		case "north":
			return exits[0];
			
		case "west":
			return exits[1];
			
		case "south":
			return exits[2];
			
		case "east":
			return exits[3];
			
		default:
			return null;
			
		}
	}
	
	public void setExit(Room room, String direction) {
		switch (direction) {
		case "north":
			exits[0] = room;
			break;
			
		case "west":
			exits[1] = room;
			break;
			
		case "south":
			exits[2] = room;
			break;
			
		case "east":
			exits[3] = room;
			break;
		}
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
//	public void setItem(String name, String description, String interaction) {
//		item.name =  name;
//		item.shortDescription = description;
//		item.longDescription = interaction;
//	}
//	
//	public String getItemName() {
//		return item.name;
//	}
//	
//	public String getItemDescription() {
//		return item.shortDescription;
//	}
//	
//	public String getItemInteraction() {
//		return item.longDescription;
//	}
		
}
