import java.util.HashMap;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
	    
	    while(true) {
	        displayMenu();
	        int choice = sc.nextInt();
	        System.out.println("");
	        
	        if (choice == 1) {
	            //add
	          System.out.println("Note: Only enter composite numbers.");
              System.out.print("Enter number you want to add: ");
              int add = sc.nextInt();
              System.out.println("");

              int j = add/2;
              int isPrime = 0;

                if(add == 0 || add == 1){
                    System.out.print("Enter key for the number you want to add: ");
                    int key = sc.nextInt();
                    System.out.println("");

                    hashmap.put(key, add);
                    System.out.println(key + "=>" + add + " is successfully added to the HashMap!");

                }
                else{
                    for(int i = 2; i <= j; i++){
                        if(add%i == 0){
                            System.out.print("Enter key for the number you want to add: ");
                            int key = sc.nextInt();
                            System.out.println("");

                            hashmap.put(key, add);
                            System.out.println(key + "=>" + add + " is successfully added to the HashMap!");
                            isPrime = 1;
                            break;
                            }
                        }
                        if(isPrime == 0){
                            System.out.println("The number you enter is a prime number. It is not added in the HashMap.");
                        }
                    }
	        }
	       
	        else if (choice == 2) {
	            //remove
	            System.out.print("Enter key you want to remove: ");
                    int remove = sc.nextInt();
                    System.out.println("");

                    if(hashmap.containsKey(remove)){
                        System.out.println(remove + "=>" + hashmap.get(remove) + " is successfully removed!");
                        hashmap.remove(remove);
                    }

	        }
	        else if(choice == 3) {
	            //display
	            System.out.println("Displaying numbers in HashMap");
                    System.out.println();
                    
                        System.out.println(hashmap);
                        
                    System.out.println();
	        }
	        else if (choice == 4) {
	            //clear
                            hashmap.clear();
                            System.out.println("Input are all cleared!");
               
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



