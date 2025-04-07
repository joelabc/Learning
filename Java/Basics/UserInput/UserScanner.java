package UserInput;
import java.util.Scanner;
public class UserScanner {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = userScanner.nextLine();
        System.out.println("Enter a number: ");
        int number = userScanner.nextInt();
        userScanner.nextLine();
        System.out.println("Enter a goal: ");
        String goal = userScanner.nextLine();
        System.out.println("The name is " +name + " and number is " + number + " with goal " + goal);
        userScanner.close();
    }
}


