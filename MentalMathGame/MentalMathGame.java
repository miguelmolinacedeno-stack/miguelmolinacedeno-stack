import java.util.Random;
import java.util.Scanner;

public class MentalMathGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctCount = 0; // Counts correct answers

        System.out.println("🧠 Mental Math Game");
        System.out.println("------------------");

        while (true) {
            int a = random.nextInt(100) + 1; // Random number 1-100
            int b = random.nextInt(100) + 1; // Random number 1-100
            int answer = a + b;

            System.out.print("What is " + a + " + " + b + "? ");
            int userInput = scanner.nextInt();

            if (userInput == answer) {
                correctCount++;
                System.out.println("✅ Correct!");
            } else {
                System.out.println("❌ Wrong! Total correct answers: " + correctCount);
                break;
            }
        }
    }
}
