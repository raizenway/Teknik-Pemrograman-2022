package polymorphicSorting;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Comparable[] intList;
		int size;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nHow many integers do you want to sort? ");
		size = scanner.nextInt();
		intList = new Comparable[size];
		
		System.out.println("\nEnter the numbers...");
		for(int i = 0; i< size; i++)
			intList[i] = scanner.nextInt();
		
		Sorting.selectionSort(intList);
		System.out.println("\nYour numbers in sorted order(Ascending)...");
		for(int i = 0; i< size;i++)
			System.out.print(intList[i] + " ");
		System.out.println();
		Sorting.insertionSort(intList);
		System.out.println("\nYour numbers in sorted order(Descending)...");
		for(int i = 0; i< size;i++)
			System.out.print(intList[i] + " ");
		System.out.println();
		
		
	}
}
