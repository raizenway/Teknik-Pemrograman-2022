package GenericMethodImplementation;

public class CharInfo {
	static <T> void displayInfo(T element) {
		System.out.println(element.getClass().getName()+" = "+element);
	}
}
