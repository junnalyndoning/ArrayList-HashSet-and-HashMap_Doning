import java.util.ArrayList;
import java.util.Scanner;
public class Main{

  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    
    ArrayList<String> Favorites = new ArrayList<>();
    System.out.println("Who is your favorite person?");
    Favorites.add(input.nextLine());
    System.out.println("What is your favorite foods?");
    Favorites.add(input.nextLine());
    System.out.println("Where is your favorite place?");
    Favorites.add(input.nextLine());
    System.out.println("What is your favorite movies?");
    Favorites.add(input.nextLine());
    System.out.println("What is your favorite memory together with you family?");
    Favorites.add(input.nextLine());
    
    System.out.println(Favorites);
    
        for (String faves : Favorites){
            System.out.println(faves);
        }
    }
}
