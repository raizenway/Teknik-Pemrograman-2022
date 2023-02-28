package Kasus1;
/*===============================================================================
 * Firm.java
 * Author	: Banteng Harisantoso
 * Demonstrates Polymorphism via inheritance
 * ==============================================================================
 */
public class Firm {
	//Creates a staff of employees for a firm and pays them
	public static void main (String[] args) 
	{
		Staff personnel = new Staff();
		
		personnel.payday();
	}
	
	
}