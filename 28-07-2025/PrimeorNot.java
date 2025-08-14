package assessment;
import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 1) {
            System.out.println("Not a prime number.");
            return;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("Not a prime number.");
                return;
            }
        }

        System.out.println("Prime number.");
    }
}
