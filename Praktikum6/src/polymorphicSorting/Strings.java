package polymorphicSorting;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		Comparable[] intList;
		int size;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nHow many word do you want to sort? ");
		size = scanner.nextInt();
		intList = new Comparable[size];
		
		System.out.println("\nEnter the word...");
		for(int i = 0; i< size; i++)
			intList[i] = scanner.next();
		
		Sorting.selectionSort(intList);
		System.out.println("\nYour words in sorted order(Ascending)...");
		for(int i = 0; i< size;i++)
			System.out.print(intList[i] + " ");
		System.out.println();
		Sorting.insertionSort(intList);
		System.out.println("\nYour words in sorted order(Descending)...");
		for(int i = 0; i< size;i++)
			System.out.print(intList[i] + " ");
		System.out.println();
		
		
	}
}
