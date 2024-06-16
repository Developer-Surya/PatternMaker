import java.util.Scanner;

public class NumberPatterns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the type of pattern to generate:");
        System.out.println("1. Pyramid Pattern");
        System.out.println("2. Right-Angled Triangle Pattern");
        System.out.println("3. Diamond Pattern");
        System.out.println("4. Square Pattern");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the number of levels: ");
        int levels = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Pyramid Pattern:");
                generatePyramid(levels);
                break;
            case 2:
                System.out.println("Right-Angled Triangle Pattern:");
                generateRightAngledTriangle(levels);
                break;
            case 3:
                System.out.println("Diamond Pattern:");
                generateDiamond(levels);
                break;
            case 4:
                System.out.println("Square Pattern:");
                generateSquare(levels);
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
        }

        scanner.close();
    }

    // Function to generate pyramid pattern
    public static void generatePyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print numbers in increasing order
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // Print numbers in decreasing order
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    // Function to generate right-angled triangle pattern
    public static void generateRightAngledTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Function to generate diamond pattern
    public static void generateDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            printSpaces(n - i);
            printStars(i);
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            printSpaces(n - i);
            printStars(i);
            System.out.println();
        }
    }

    // Helper function to print spaces
    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    // Helper function to print stars
    public static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
    }

    // Function to generate square pattern
    public static void generateSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
