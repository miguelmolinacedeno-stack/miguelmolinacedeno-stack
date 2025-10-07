import java.util.Scanner;

public class TallestTreeFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        findTallestTree(input); // Call method to find the tallest tree
    }

    public static void findTallestTree(Scanner scanner) {
        boolean stop = false; // Controls when to stop input
        int height;           // Height of the current tree
        int maxHeight = 0;    // Stores the tallest height found
        int maxId = 0;        // Stores the ID of the tallest tree
        int id = 0;           // Tree ID

        System.out.println(" Tallest Tree Finder");
        System.out.println("----------------------");

        do {
            System.out.print("Enter height of tree " + id + " (cm, -1 to stop): ");
            height = scanner.nextInt();

            if (height == -1) {
                stop = true; // Stop the loop
            } else {
                if (height > maxHeight) {
                    maxHeight = height; // Update max height
                    maxId = id;         // Update tallest tree ID
                }
                id++; // Increment tree ID
            }

        } while (!stop);

        System.out.println("\nThe tallest tree is " + maxHeight + " cm tall (ID: " + maxId + ").");
    }
}
