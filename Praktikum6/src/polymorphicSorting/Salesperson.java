package polymorphicSorting;

public class Salesperson implements Comparable{
	private String firstName, lastName;
	private int totalSales;
	
	public Salesperson(String first, String last, int sales) {
		this.firstName = first;
		this.lastName = last;
		this.totalSales = sales;
	}
	
	public String toString() {
		return lastName + ", " + firstName + ": \t" + totalSales;
	}
	
	public boolean equals (Object other) {
		return (lastName.equals(((Salesperson)other).getLastName()) && firstName.equals(((Salesperson)other).getFirstName()));
	}
	
	@Override
	public int compareTo(Object other) {
		int result = Integer.compare(this.totalSales, ((Salesperson)other).totalSales);
		if (result == 0) {
			return this.lastName.compareTo(((Salesperson)other).lastName);
		}
		return result;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getSales() {
		return totalSales;
	}
}
