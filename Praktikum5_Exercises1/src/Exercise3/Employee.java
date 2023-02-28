package Exercise3;

class Employee extends Sortable {
	
	/* ANOTHER METHODS */
	public int compare(Sortable b) {
	    Employee eb = (Employee)b;
	    if (salary < eb.salary) return -1;
	    else if (salary > eb.salary) return 1;
	    else return 0;
	   
	}
	
	public Employee(String n, double s, int day, int month, int year) {
		name = n;
		salary = s;
		hireday = day;
		hiremonth = month;
		hireyear = year;
	}
	
	public void print() {
		System.out.println(name+" "+salary+" "+hireyear);
	}
	
	public void raiseSalary(double byPercent) {
		salary *= 1+ byPercent / 100;
	}
	
	public int hireYear() {
		return hireyear;
	}
	
	private String name;
	private double salary;
	private int hireday;
	private int hireyear;
	private int hiremonth;

}
