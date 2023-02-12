
public class Character {
	private String name;
	private int hp;
	
	public Character(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void useHpItem(HpItem hpitem) {
		hp += hpitem.getHpBonus();
		System.out.println(name + " use " + hpitem.getItemName() + " HP increased by " + hpitem.getHpBonus());
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}
