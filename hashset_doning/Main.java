import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class Main{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Set<String> Favorites = new HashSet<String>();
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
       
        Iterator<String> it = Favorites.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
    
        }
    }
}