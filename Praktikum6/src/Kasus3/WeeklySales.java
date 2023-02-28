package Kasus3;

import java.util.Scanner;

public class WeeklySales 
{
    public static void main(String[] args)
    {
        
        int size,totalSales;
        String firstName,lastName;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many Employee do you want to enter?");
        size = scan.nextInt();
        scan.nextLine();
        Salesperson[] salesStaff = new Salesperson[size];
        for (int i=0; i<size; i++){
            System.out.println("Enter first name [" + (i+1) + "]: ");
            firstName = scan.nextLine();
            System.out.println("Enter last name [" + (i+1) + "]: ");
            lastName = scan.nextLine();
            System.out.println("Enter total sales [" + (i+1) + "]: ");
            totalSales = scan.nextInt();
            scan.nextLine();
            salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
        }
        Sorting.insertionSort(salesStaff);
        
        System.out.println ("\nRanking of Sales for the Week\n");
        
        for (Salesperson s : salesStaff)
            System.out.println (s);
    }
}