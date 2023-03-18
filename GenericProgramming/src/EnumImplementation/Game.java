package EnumImplementation;

public class Game {

	public static void main(String[] args) {
		Character c1 = new Character("Albert", CharacterClass.GOLD, Weapon.BOW, Element.LIGHTNING);
		Character c2 = new Character("Alisha", CharacterClass.BRONZE, Weapon.CATALYST, Element.ICE);
		Character c3 = new Character("Robert", CharacterClass.SILVER, Weapon.CLAYMORE, Element.EARTH);
				
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
