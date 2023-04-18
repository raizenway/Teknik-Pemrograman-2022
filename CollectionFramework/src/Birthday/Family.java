package Birthday;
import java.util.*;

public class Family {
	Set<Uncle> uncles;
	List<Niece> nieces;
	
	public Family() {
		uncles = new HashSet<>();
		nieces = new ArrayList<>();
	}
	
	public boolean addNiece(String name, int day, int month) {
		if(findNiece(name) == null) {
			Niece niece = new Niece(name, day, month);
			nieces.add(niece);
			return true;
		} else {
			return false;
		}
	}
	
	public boolean addUncle(String name) {
		if(findUncle(name) == null) {
			Uncle uncle = new Uncle(name);
			uncles.add(uncle);
			return true;
		} else {
			return false;
		}
	}
	
	public Niece findNiece(String name) {
		for(Niece person : nieces) {
			if(person.getName().equals(name)) return person;
		}
		
		return null;
	}
	
	public Uncle findUncle(String name) {
		for(Uncle person : uncles) {
			if(person.getName().equals(name)) return person;
		}
		
		return null; 
	}
	
	public void listNieces() {
	    nieces.stream()
	          .sorted(Comparator.comparing(Niece::getMonth).thenComparing(Niece::getDay))
	          .forEach(niece -> System.out.println(niece.getName() + "\t" + niece.getDay() + "/" + niece.getMonth()));
	}
	
	public void listUncles() {
		Set<String> names = new TreeSet<>();
		
		for(Uncle person : uncles) {
			names.add(person.getName());
		}
		
		for(String name : names) {
			System.out.println(name);
		}
	}

	public Set<Uncle> getUncles() {
		return uncles;
	}

	public List<Niece> getNieces() {
		return nieces;
	}
	
	
}
