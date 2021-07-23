package Fixture;

public class Item extends Fixture{
	
	public Item() {
	}
	
	public Item(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}
	
	public void setItem(String name, String description, String interaction) {
		this.name =  name;
		this.shortDescription = description;
		this.longDescription = interaction;
	}

	
}
