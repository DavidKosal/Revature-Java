package Fixture;

public class Room extends Fixture{
	Room[] exits = new Room[5];
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[5];
	}
	
	public Room[] getExits() {
		return null;
	}
	
	public Room getExit(String direction) {
		return null;
	}
}
