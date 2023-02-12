
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HpItem shimenawa = new HpItem("Shimenawa", 4000);
		HpItem millelith = new HpItem("Millelith", 10000);
		Character HuTao = new Character("Hu Tao", 15000);
		
		System.out.println("HuTao Base HP : " + HuTao.getHp());
		HuTao.useHpItem(shimenawa);
		System.out.println("HuTao HP (Shimenawa) : "+HuTao.getHp());
		HuTao.useHpItem(millelith);
		System.out.println("HuTao HP (Millelith) : "+HuTao.getHp());
	}
	
	
}
