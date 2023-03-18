package GenericClassImplementation;

public class HP <T> {
	private T t;
	
	public void addHP(T t) {
		this.t = t;
	}
	
	public T getHp() {
		return t;
	}
	
}
