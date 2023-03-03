package Latihan6;

public class InputCharacterData {

	public static void main(String[] args) {
		CharacterData charData = new CharacterData("Hu Tao", "Female", "Medium", "Pyro", "Polearm");
		System.out.println("Name: "+charData.char_name());
		System.out.println("Gender: "+charData.gender());
		System.out.println("Height: "+charData.heigth());
		System.out.println("Vision: "+charData.vision());
		System.out.println("Weapon: "+charData.weapon()+"\n");
		
		CharacterData charData2 = new CharacterData("Kazuha", "Male", "Medium", "Anemo", "Sword");
		System.out.println("Name: "+charData2.char_name());
		System.out.println("Gender: "+charData2.gender());
		System.out.println("Height: "+charData2.heigth());
		System.out.println("Vision: "+charData2.vision());
		System.out.println("Weapon: "+charData2.weapon());
		
		
	}
}