package EnumImplementation;

public class Character {
	Weapon weapon;
	Element element;
	CharacterClass charClass;
	String name;
	
	public Character(String name,CharacterClass charClass, Weapon weapon, Element element) {
		this.name = name;
		this.charClass = charClass;
		this.weapon = weapon;
		this.element = element;
	}
	
	public String toString() {
		return "Character Profile:"+"\nName: "+name+"\nClass: "+charClass+"\nWeapon: "+weapon+"\nElement: "+element+"\n\n";
	}
	
}
