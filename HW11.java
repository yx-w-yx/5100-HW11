import java.util.Scanner;
import java.util.InputMismatchException;

public class HW11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;
    
        while (!validInput) {
            try {
                System.out.println("Enter an integer: ");
                number = scanner.nextInt();
                validInput = true;
            } catch(InputMismatchException e){
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
    }
    System.out.println("You entered: " + number);
    scanner.close();
    }
    
}
