import java.util.Scanner;
public class MovieDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Movie obj = new Movie();
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            System.out.println("Enter the name of a movie");
            String title = keyboard.nextLine();
            obj.setTitle(title);
            System.out.println("Enter the rating of the movie");
            String rating = keyboard.nextLine();
            obj.getRating();
            obj.setRating(rating);
            System.out.println("Enter the number of tickets sold for this movie");
            int ticketsSold = keyboard.nextInt();
            keyboard.nextLine();
            obj.getSoldTickets();
            obj.setSoldTickets(ticketsSold);            
            System.out.println(obj.toString());
            System.out.println("Do you want to enter another? (y or n)");
            choice = keyboard.nextLine();
        }
        System.out.println("Goodbye");
    }
}