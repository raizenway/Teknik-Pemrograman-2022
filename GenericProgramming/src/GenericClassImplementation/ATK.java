package GenericClassImplementation;

public class ATK<T> {
		private T t;
		
		public void addATK(T t) {
			this.t = t;
		}
		
		public T getATK() {
			return t;
		}
		
	}
