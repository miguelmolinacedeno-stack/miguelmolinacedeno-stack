import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("🔢 Digit Counter");
        System.out.println("----------------");

        do {
            System.out.print("Enter an integer (0 to exit): ");
            number = scanner.nextInt();

            if (number != 0) {
                int digits = countDigits(number); // Count digits
                System.out.println(number + " has " + digits + " digit(s).");
            }

        } while (number != 0);

        System.out.println("Goodbye!");
    }

    // Method to count digits of a number
    public static int countDigits(int n) {
        n = Math.abs(n); // Handle negative numbers
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            n /= 10; // Remove last digit
            count++;
        }
        return count;
    }
}
