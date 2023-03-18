package polymorphicSorting;

public class WeeklySales {
	public static void main(String[] args) {
		Salesperson[] salesStaff = new Salesperson[2];
		
		salesStaff[0] = new Salesperson("Hari", "Santoso", 56);
		salesStaff[1] = new Salesperson("Harith", "Zantoso", 75);
		
		
		Sorting.insertionSort(salesStaff);
		
		System.out.println("\nRanking of Sales for the Week\n");
		
		for(Salesperson s : salesStaff)
			System.out.println(s);
	}
}
