package starCraft.game.gameComponent;

import lombok.Getter;

@Getter
public class Terran {
	private String name;
	private int resource;
	private int power;
	private int id;

	public Terran(String name, int resource, int power, int id) {
		super();
		this.name = name;
		this.resource = resource;
		this.power = power;
		this.id = id;
	}
	
	

}
