package Kasus1;

public class Commission extends Hourly{
	private double employeeTotalSales;
	private double commissionRate;
	
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double com_Rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = com_Rate;
	}
	
	public void addSales(double totalSales) {
		this.employeeTotalSales += totalSales;
	}
	
	public double pay()
	{
	double payment = super.pay() + (employeeTotalSales*commissionRate);
	employeeTotalSales = 0;
	return payment;
	}
	
	public String toString() {
		return super.toString() + "\nTotal Sales: "+employeeTotalSales;
		}
	}