package GenericClassImplementation;

public class CharacterStat {

	public static void main(String[] args) {
		HP<Integer> albertHp = new HP<Integer>();
		albertHp.addHP(25000);
		ATK<Double> albertAtk = new ATK<Double>();
		albertAtk.addATK(1650.765);
		DEF<Integer> alberDef = new DEF<Integer>();
		alberDef.addDEF(876);
		
		HP<Double> alishaHp = new HP<Double>();
		alishaHp.addHP(12500.250);
		ATK<Integer> alishaAtk = new ATK<Integer>();
		alishaAtk.addATK(730);
		DEF<Integer> alishaDef = new DEF<Integer>();
		alishaDef.addDEF(430);
		
		System.out.println("Albert HP: "+albertHp.getHp());
		System.out.println("Albert ATK: "+albertAtk.getATK());
		System.out.println("Albert DEF: "+alberDef.getDEF());
		
		System.out.println("\nAlisha HP: "+alishaHp.getHp());
		System.out.println("Alisha ATK: "+alishaAtk.getATK());
		System.out.println("Alisha DEF: "+alishaDef.getDEF());
	}
	
}
