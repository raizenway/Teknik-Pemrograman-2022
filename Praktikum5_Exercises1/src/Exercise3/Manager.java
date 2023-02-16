package Exercise3;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Manager extends Employee {
	public Manager(String n, double s, int d, int m) {
		super(n, s, d, m, m);
		secretaryName = "";
	}
	
	public void raiseSalary(double byPercent) {
		//add 1/2% bonus for every year of service
		GregorianCalendar todaysDate = new GregorianCalendar();
		int currentYear = todaysDate.get(Calendar.YEAR);
		double bonus = 0.5 * (currentYear - super.hireYear());
		super.raiseSalary(byPercent+bonus);
	}
	
	public String getSecretaryName() {
		return secretaryName;
	}
	
	private String secretaryName;

}
