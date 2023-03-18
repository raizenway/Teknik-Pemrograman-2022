package Latihan6;

public class CharacterData extends Character implements Vision, Weapon {
	private String name;
	private String gender;
	private String height;
	private String vision;
	private String weapon;
	
	
	//Constructor
	public CharacterData(String name, String gender, String height, String vision, String weapon ) {
		this.name = name + "santoso";
		this.gender = gender;
		this.height = height;
		this.vision = vision;
		this.weapon = weapon;
	}
	
	@Override
	public String weapon() {
		return weapon;
		
	}

	@Override
	public String vision() {
		return vision;
	}

	@Override
	public String char_name() {
		return name;
	}

	@Override
	public String gender() {
		return gender;
	}

	@Override
	public String heigth() {
		return height;
	}
	
}
