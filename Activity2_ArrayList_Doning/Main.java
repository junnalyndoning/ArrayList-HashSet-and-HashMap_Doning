import java.util.Scanner;
import java.util.ArrayList;
public class Main{

	public static void main(String[] args) {
	    ArrayList <Integer> intnum = new ArrayList<>();
	    Scanner input = new Scanner(System.in);
	    
	    while(true) {
	        displayMenu();
	        int choice = input.nextInt();
	        System.out.println("");
	        
	        if (choice == 1) {
	            //add
	           System.out.println("Enter the number you want to add: "); 
	            int add = input.nextInt();
	           if (add < 0) {
                        System.out.println("Invalid the number is negative! Please enter a positive number!");
                    } else {
                        intnum.add(add);
                        System.out.println("Successfully the number has been added");
                        System.out.println("");
	        }
	        }
	       
	        else if (choice == 2) {
	            //remove
	            System.out.println("Enter the number you wanted to removed: ");
	            int elementToRemove = input.nextInt();
	            if (intnum.contains(elementToRemove)) {
	                intnum.remove(Integer.valueOf(elementToRemove));
	                System.out.println("The number has been removed.");
	            }else 
	                System.out.println("Number not found");
	        }
	        else if(choice == 3) {
	            //display
	            System.out.println("Your Input: " + intnum);
	        }
	        else if (choice == 4) {
	            //clear
	            intnum.clear();
	            System.out.println("List of numbers are cleared.");
	        }
	        else if (choice == 5) {
	            //exit
	            System.out.println("Goodbye and have a great day, see you until next time.");
	            break;
	        }
	    }
	
	}
	
	
	private static void displayMenu(){
	    System.out.println("---------------------------------");
	    System.out.println("Welcome Users! This are the Menu:");
	    System.out.println();
	    System.out.println("1.Add Number");
	    System.out.println("2.Removed Number");
	    System.out.println("3.Display Number");
	    System.out.println("4.Clear Number");
	    System.out.println("5.Exit");
	    System.out.println();
	    System.out.println("Please select your choice");
	}
}

