package practice;
import java.util.Scanner;

public class ExcHandling {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter first numerator: ");
	            int a = scanner.nextInt();

	            System.out.print("Enter second denominator: ");
	            int b = scanner.nextInt();

	            int result = a / b; 
	            System.out.println("Result: " + result);
	            
	        } catch (ArithmeticException e) {
	            System.out.println("Division by zero is not allowed.");
	            
	        } catch (Exception e) {
	            System.out.println("Invalid input. Please enter integers only.");
	            
	        } finally {
	            System.out.println("Excution completed.");
	            scanner.close(); 
	        }
	}
}

