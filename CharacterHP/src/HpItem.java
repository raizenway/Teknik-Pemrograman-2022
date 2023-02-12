
public class HpItem {
	private String itemName;
	private int hpBonus;
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setHpBonus(int hpBonus) {
		this.hpBonus = hpBonus;
	}

	public HpItem(String itemName, int hpBonus) {
		this.itemName = itemName;
		this.hpBonus = hpBonus;
	}
	
	public String getItemName() {
		return this.itemName;
	}
	
	public int getHpBonus() {
		return this.hpBonus;
	}
	}


