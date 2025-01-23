
package console; 
import java.util.Scanner;

public class console {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Welcome to the Basic Console App!");

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

      
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

       
        double sum = num1 + num2;

        
        System.out.println("\nHello, " + name + "!");
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");

        
        scanner.close();
    }
}
